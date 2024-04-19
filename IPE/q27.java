import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversedNumber = reverse(number);

        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }

    // Method to reverse a number
    public static int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        return reversed;
    }
}
