import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);

        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }

    // Method to calculate the sum of digits of a number
    public static int calculateSumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            num /= 10; // Remove the last digit from the original number
        }

        return sum;
    }
}
