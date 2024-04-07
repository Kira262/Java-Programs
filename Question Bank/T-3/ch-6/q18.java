public class q18 {
    public static void main(String[] args) {
        // Simulating InterruptedException
        try {
            // Simulating a thread sleep operation
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Catching InterruptedException
            System.out.println("InterruptedException occurred!");
            // Optionally, rethrow the exception
            throw new RuntimeException(e);
        } finally {
            // Finally block to execute cleanup code
            System.out.println("Inside finally block for InterruptedException");
        }

        // Simulating IllegalArgumentException
        try {
            // Simulating a method with an illegal argument
            int result = divideByZero(10, 0);
            System.out.println("Result of division: " + result);
        } catch (IllegalArgumentException e) {
            // Catching IllegalArgumentException
            System.out.println("IllegalArgumentException occurred!");
            // Optionally, rethrow the exception
            throw new RuntimeException(e);
        } finally {
            // Finally block to execute cleanup code
            System.out.println("Inside finally block for IllegalArgumentException");
        }
    }

    // Method to simulate IllegalArgumentException
    private static int divideByZero(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return dividend / divisor;
    }
}
