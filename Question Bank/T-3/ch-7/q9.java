class OddNumberThread extends Thread {
    private int start;
    private int end;

    public OddNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <number>");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int threadsCount = (n % 100 == 0) ? n / 100 : n / 100 + 1;

        Thread[] threads = new Thread[threadsCount];

        for (int i = 0; i < threadsCount - 1; i++) {
            int start = i * 100 + 1;
            int end = start + 99;
            threads[i] = new OddNumberThread(start, end);
            threads[i].start();
        }

        int start = (threadsCount - 1) * 100 + 1;
        int end = n;
        threads[threadsCount - 1] = new OddNumberThread(start, end);
        threads[threadsCount - 1].start();

        // Wait for all threads to complete
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
