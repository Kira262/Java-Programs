import java.util.Scanner;

class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count the number of vowels in the string
        int vowelCount = countVowels(input);

        // Display the count of vowels
        System.out.println("Number of vowels in the string: " + vowelCount);

        // Close the scanner
        scanner.close();
    }

    // Method to count the number of vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase to simplify vowel checking
        str = str.toLowerCase();
        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel (a, e, i, o, u)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
