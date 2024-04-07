public class Qb51 {

    // Addition methods
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a + b;
    }

    // Subtraction methods
    public int calculateSubtraction(int a, int b) {
        return a - b;
    }

    public double calculateSubtraction(double a, double b) {
        return a - b;
    }

    // Multiplication methods
    public int calculateMultiplication(int a, int b) {
        return a * b;
    }

    public double calculateMultiplication(double a, double b) {
        return a * b;
    }

    // Division methods
    public double calculateDivision(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Qb51 calculator = new Qb51();

        // Addition
        System.out.println("Addition:");
        System.out.println("Integer Addition: " + calculator.calculate(5, 3));
        System.out.println("Double Addition: " + calculator.calculate(5.5, 3.2));

        // Subtraction
        System.out.println("\nSubtraction:");
        System.out.println("Integer Subtraction: " + calculator.calculateSubtraction(5, 3));
        System.out.println("Double Subtraction: " + calculator.calculateSubtraction(5.5, 3.2));

        // Multiplication
        System.out.println("\nMultiplication:");
        System.out.println("Integer Multiplication: " + calculator.calculateMultiplication(5, 3));
        System.out.println("Double Multiplication: " + calculator.calculateMultiplication(5.5, 3.2));

        // Division
        System.out.println("\nDivision:");
        System.out.println("Division: " + calculator.calculateDivision(10.0, 2.0));
        System.out.println("Division by zero: " + calculator.calculateDivision(5.0, 0.0));
    }
}
