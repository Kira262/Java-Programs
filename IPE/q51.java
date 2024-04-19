import java.util.Scanner;

class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Display the reversal of the entered integer
        System.out.print("Reversal of " + number + " is ");
        reverse(number);

        // Close the scanner
        scanner.close();
    }

    // Method to display an integer in reverse order
    public static void reverse(int number) {
        // Convert the integer to a string to reverse it easily
        String numberStr = String.valueOf(number);
        // Iterate through the characters of the string in reverse order
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            System.out.print(numberStr.charAt(i));
        }
        System.out.println();
    }
}
