import java.util.Scanner;

class SumOfFirstAndLastDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = sumOfFirstAndLastDigits(number);

        System.out.println("Sum of first and last digits: " + sum);

        scanner.close();
    }

    // Method to calculate the sum of the first and last digits of a number
    public static int sumOfFirstAndLastDigits(int num) {
        int lastDigit = num % 10; // Extract the last digit

        // Find the first digit
        while (num >= 10) {
            num /= 10;
        }
        int firstDigit = num;

        return firstDigit + lastDigit;
    }
}
