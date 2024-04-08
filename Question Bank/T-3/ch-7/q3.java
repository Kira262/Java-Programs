class PrimeCheckerThread extends Thread {
    private int number;

    public PrimeCheckerThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
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
}

class PrimePrinterThread extends Thread {
    @Override
    public void run() {
        System.out.println("Prime numbers between 0 and 100:");
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
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
}

class Main {
    public static void main(String[] args) {
        int numberToCheck = 17; // You can change this number to test
        PrimeCheckerThread checkerThread = new PrimeCheckerThread(numberToCheck);
        PrimePrinterThread printerThread = new PrimePrinterThread();

        checkerThread.start();
        printerThread.start();
    }
}
