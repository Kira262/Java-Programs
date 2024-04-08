class PrimeNumberFinder implements Runnable {
    private int number;

    public PrimeNumberFinder(int number) {
        this.number = number;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[] numbers = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Thread[] threads = new Thread[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            threads[i] = new Thread(new PrimeNumberFinder(numbers[i]));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Check if any thread is still alive
        for (Thread thread : threads) {
            if (thread.isAlive()) {
                System.out.println("Thread " + thread.getName() + " is still running.");
            }
        }
    }
}
