import java.util.Scanner;

class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Concatenate the strings without using built-in functions
        String concatenatedString = concatenateStrings(str1, str2);

        // Display the concatenated string
        System.out.println("Concatenated string: " + concatenatedString);

        // Close the scanner
        scanner.close();
    }

    // Method to concatenate two strings without using built-in functions
    public static String concatenateStrings(String str1, String str2) {
        // Calculate the length of the concatenated string
        int length1 = str1.length();
        int length2 = str2.length();
        int totalLength = length1 + length2;

        // Create a character array to hold the concatenated string
        char[] result = new char[totalLength];

        // Copy characters from the first string to the result array
        for (int i = 0; i < length1; i++) {
            result[i] = str1.charAt(i);
        }

        // Copy characters from the second string to the result array
        for (int i = 0; i < length2; i++) {
            result[length1 + i] = str2.charAt(i);
        }

        // Convert the character array to a string
        return new String(result);
    }
}
