public class q26 {
    public static void main(String[] args) {
        // Check if there are at least two command-line arguments
        if (args.length >= 2) {
            // Parse the first and second command-line arguments to integers
            int arg1 = Integer.parseInt(args[0]);
            int arg2 = Integer.parseInt(args[1]);

            // Check if the sum of the first and second command-line arguments is 10
            if (arg1 + arg2 == 10) {
                // Display error message
                System.out.println("Error: Sum of first and second command-line arguments is 10.");
            } else {
                // Process other command-line arguments
                System.out.println("Sum of first and second command-line arguments is not 10.");
            }
        } else {
            // If less than two command-line arguments are provided
            System.out.println("Error: Please provide at least two command-line arguments.");
        }
    }
}
