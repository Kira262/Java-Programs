import java.util.Scanner;

public class Qb50 {

    // Method to calculate area of circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of triangle
    public double area(float base, float height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Qb50 calculator = new Qb50();

        System.out.println("Choose an option:");
        System.out.println("1. Calculate area of circle");
        System.out.println("2. Calculate area of rectangle");
        System.out.println("3. Calculate area of triangle");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        double result = 0.0;
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                result = calculator.area(radius);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                result = calculator.area(length, width);
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                result = calculator.area(base, height);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("Area: " + result);
        scanner.close();
    }
}
