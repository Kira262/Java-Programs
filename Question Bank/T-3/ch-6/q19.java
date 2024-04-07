public class q19 {
    public static void main(String[] args) {
        try {
            // Check if two command line arguments are provided
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide two integers as command line arguments.");
            }

            // Parse the command line arguments to integers
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            // Check if x or y are negative
            if (x < 0 || y < 0) {
                throw new IllegalArgumentException("Both x and y must be non-negative integers.");
            }

            // Compute x^y using repetitive multiplication
            int result = power(x, y);
            System.out.println(x + " raised to the power of " + y + " is: " + result);
        } catch (NumberFormatException e) {
            // Handle NumberFormatException (invalid integer format)
            System.out.println("Please provide valid integers as command line arguments.");
        } catch (IllegalArgumentException e) {
            // Handle IllegalArgumentException (invalid x or y)
            System.out.println(e.getMessage());
        }
    }

    // Method to compute x^y using repetitive multiplication
    private static int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
