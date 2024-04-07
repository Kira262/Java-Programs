public class q20 {
    public static void main(String[] args) {
        boolean errorFound = false;

        // Iterate through the command-line arguments
        for (String arg : args) {
            // Check if the argument does not begin with an uppercase letter
            if (!startsWithUppercase(arg)) {
                // If found, display an error message and set errorFound to true
                System.out.println("Error: Argument \"" + arg + "\" does not begin with an uppercase letter.");
                errorFound = true;
            }
        }

        // If any error was found, terminate the program
        if (errorFound) {
            System.exit(1);
        }

        // Otherwise, continue with the program
        System.out.println("All arguments begin with an uppercase letter.");
    }

    // Method to check if a string starts with an uppercase letter
    private static boolean startsWithUppercase(String str) {
        // Check if the string is not empty and the first character is an uppercase
        // letter
        return !str.isEmpty() && Character.isUpperCase(str.charAt(0));
    }
}
