import java.util.Scanner;

class ArmstrongChecker {
    // Method to check if a number is Armstrong
    boolean isArms(int number) {
        int og = number;
        int num_digits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, num_digits);
            number /= 10;
        }

        return og == sum;
    }
}

public class Qb35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();

        ArmstrongChecker armCHecker = new ArmstrongChecker();
        boolean isArms = armCHecker.isArms(number);

        if (isArms) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        s.close();
    }
}
