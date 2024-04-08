class PaymentThread extends Thread {
    private static int totalPayments = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            makePayment(100);
        }
    }

    private synchronized void makePayment(int amount) {
        totalPayments += amount;
    }

    public static int getTotalPayments() {
        return totalPayments;
    }
}

 class Main {
    public static void main(String[] args) {
        PaymentThread[] threads = new PaymentThread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new PaymentThread();
            threads[i].start();
        }

        // Wait for all threads to complete
        for (PaymentThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total payments: " + PaymentThread.getTotalPayments() + " Rs");
    }
}
