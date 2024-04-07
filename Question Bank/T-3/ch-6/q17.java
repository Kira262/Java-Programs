public class q17 {
    public static void main(String[] args) {
        // Array with 5 elements
        int[] numbers = { 1, 2, 3, 4, 5 };

        try {
            // Accessing an index beyond the array size
            int value = numbers[6];
            System.out.println("Value at index 6: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching ArrayIndexOutOfBoundsException
            System.out.println("Array index out of bounds exception occurred!");
            // Optionally, rethrow the exception
            throw e;
        } finally {
            // Finally block to execute cleanup code
            System.out.println("Inside finally block");
        }
    }
}
