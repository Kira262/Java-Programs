import java.util.Scanner;

class GeometryCalculator {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static double rectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double circleArea = circleArea(radius);
        System.out.println("Area of the circle: " + circleArea);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        double rectangleArea = rectangleArea(length, width);
        double rectanglePerimeter = rectanglePerimeter(length, width);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);

        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();
        double triangleArea = triangleArea(base, height);
        System.out.println("Area of the triangle: " + triangleArea);

        sc.close();
    }
}
