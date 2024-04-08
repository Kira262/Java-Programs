class EvenTotalThread implements Runnable {
    private int limit;

    public EvenTotalThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int total = 0;
        for (int i = 2; i <= limit * 2; i += 2) {
            total += i;
        }
        System.out.println("Total of first " + limit + " even numbers: " + total);
    }
}

class OddTotalThread implements Runnable {
    private int limit;

    public OddTotalThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        int total = 0;
        for (int i = 1; i <= limit * 2 - 1; i += 2) {
            total += i;
        }
        System.out.println("Total of first " + limit + " odd numbers: " + total);
    }
}

 class Main {
    public static void main(String[] args) {
        // Read the limit from the user
        int limit = Integer.parseInt(args[0]);

        // Create instances of threads
        EvenTotalThread evenThread = new EvenTotalThread(limit);
        OddTotalThread oddThread = new OddTotalThread(limit);

        // Create threads
        Thread thread1 = new Thread(evenThread);
        Thread thread2 = new Thread(oddThread);

        // Start threads
        thread1.start();
        thread2.start();
    }
}
