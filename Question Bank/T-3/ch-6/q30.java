public class q30 {
    public static void main(String[] args) {
        // Iterate through the command-line arguments
        for (String arg : args) {
            // Convert the argument to an integer
            int num = Integer.parseInt(arg);

            // Check if the number is negative
            if (num < 0) {
                // Display error message
                System.out.println("Error: Negative number found in command-line arguments.");
                // Exit the program
                System.exit(1);
            }
        }

        // If no negative number is found
        System.out.println("All command-line arguments are non-negative.");
    }
}
