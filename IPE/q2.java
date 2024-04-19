// WAP that reads two nos. from key board and gives their addition, subtraction, multiplication, division and modulo.
import java.util.Scanner;

class ArithmeticOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double addition = num1 + num2;
        System.out.println("Addition: " + addition);

        double subtraction = num1 - num2;
        System.out.println("Subtraction: " + subtraction);

        double multiplication = num1 * num2;
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        if (num2 != 0) {
            double modulo = num1 % num2;
            System.out.println("Modulo: " + modulo);
        } else {
            System.out.println("Cannot compute modulo with zero divisor.");
        }

        sc.close();
    }
}
