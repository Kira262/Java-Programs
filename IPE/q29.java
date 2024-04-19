import java.util.Scanner;

class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number to check for Armstrong numbers: ");
        int maxNumber = scanner.nextInt();

        System.out.println("Armstrong numbers between 1 and " + maxNumber + ":");
        for (int i = 1; i <= maxNumber; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += Math.pow(digit, numberOfDigits); // Add the digit raised to the power of numberOfDigits
            number /= 10; // Remove the last digit from the original number
        }

        return sum == originalNumber;
    }
}
