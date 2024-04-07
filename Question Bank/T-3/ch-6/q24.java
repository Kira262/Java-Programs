public class q24 {
    public static void main(String[] args) {
        // Check if there are command-line arguments
        if (args.length > 0) {
            // Check if the first command-line argument is zero
            if (args[0].equals("0")) {
                // Display error message
                System.out.println("Error: First command-line argument cannot be zero.");
            } else {
                // Process other command-line arguments
                System.out.println("First command-line argument is not zero: " + args[0]);
            }
        } else {
            // If no command-line arguments are provided
            System.out.println("Error: No command-line arguments provided.");
        }
    }
}
