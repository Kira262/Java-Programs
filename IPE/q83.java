class OddNumberThread implements Runnable {
    private static final Object lock = new Object();
    private static int currentNumber = 1;
    @SuppressWarnings("unused")
    private int start;
    private int end;

    public OddNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        synchronized (lock) {
            while (currentNumber <= end) {
                for (int i = 0; i < 50 && currentNumber <= end; i++) {
                    if (currentNumber % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + currentNumber);
                    }
                    currentNumber++;
                }
                lock.notify(); // Notify other threads
                if (currentNumber <= end) {
                    try {
                        lock.wait(); // Wait for other threads to print
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class OddNumberPrinter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java OddNumberPrinter <n>");
            return;
        }

        int n = Integer.parseInt(args[0]);

        int numThreads = (n + 49) / 50; // Calculate number of threads required

        Thread[] threads = new Thread[numThreads];

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            int start = i * 50 + 1;
            int end = Math.min(start + 49, n);
            threads[i] = new Thread(new OddNumberThread(start, end));
            threads[i].start();
        }

        // Join threads
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
