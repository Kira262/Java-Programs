import java.util.Scanner;

class DigitProductCalculator {
    // Method to find the product of all digits of an integer number
    int calculateDigitProduct(int number) {
        int product = 1;
        while (number != 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        return product;
    }
}

public class Qb33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        DigitProductCalculator digitProductCalculator = new DigitProductCalculator();
        int product = digitProductCalculator.calculateDigitProduct(number);

        System.out.println("Product of digits: " + product);

        scanner.close();
    }
}
