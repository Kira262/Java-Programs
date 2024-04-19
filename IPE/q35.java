import java.util.Scanner;

class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables to store sum, max, min, and count of numbers
        int sum = 0;
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer value
        int min = Integer.MAX_VALUE; // Initialize min to the largest possible integer value

        // Read 10 numbers from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            // Update sum
            sum += number;

            // Update max
            if (number > max) {
                max = number;
            }

            // Update min
            if (number < min) {
                min = number;
            }
        }

        // Calculate average
        double average = (double) sum / 10;

        // Display results
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);

        // Close the scanner
        scanner.close();
    }
}
