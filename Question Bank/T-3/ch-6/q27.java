import java.util.Scanner;

// Custom exception class
class MarksBelowPassException extends Exception {
    // Constructor
    public MarksBelowPassException(String message) {
        super(message);
    }
}

// Main class
public class q27 {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Array to store subject marks
        int[] marks = new int[5];

        try {
            // Enter subject marks
            System.out.println("Enter marks out of 100 for five subjects:");
            for (int i = 0; i < marks.length; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();

                // Check if marks are less than 35
                if (marks[i] < 35) {
                    throw new MarksBelowPassException("Marks for Subject " + (i + 1) + " are below pass.");
                }
            }

            // If all marks are above pass marks
            System.out.println("All subject marks are above pass marks.");
        } catch (MarksBelowPassException e) {
            // Handle exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions (e.g., InputMismatchException)
            System.out.println("Invalid input. Please enter integer marks.");
        } finally {
            // Close scanner
            scanner.close();
        }
    }
}
