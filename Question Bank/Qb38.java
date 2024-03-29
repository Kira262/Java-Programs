import java.util.Scanner;

class Calculator {
    // Method for sum operation without arguments and without return
    @SuppressWarnings("resource")
    void sum() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = s.nextDouble();
        double result = n1 + n2;
        System.out.println("Sum: " + result);
    }

    // Method for subtraction operation with arguments and without return
    void minus(double n1, double n2) {
        double result = n1 - n2;
        System.out.println("Difference: " + result);
    }

    // Method for multiplication operation without arguments and with return
    @SuppressWarnings("resource")
    double multi() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = s.nextDouble();
        double result = n1 * n2;
        return result;
    }

    // Method for division operation with arguments and with return
    double divide(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        double result = n1 / n2;
        return result;
    }
}

public class Qb38 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Sum operation without arguments and without return
        calculator.sum();

        // Minus operation with arguments and without return
        double number1 = 10.5;
        double number2 = 5.2;
        calculator.minus(number1, number2);

        // Multiplication operation without arguments and with return
        double multiplicationResult = calculator.multi();
        System.out.println("Multiplication: " + multiplicationResult);

        // Division operation with arguments and with return
        double divisionResult = calculator.divide(20, 4);
        System.out.println("Division: " + divisionResult);
    }
}
