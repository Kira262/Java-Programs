//Clac area of circle ,  square and rectangle . Use class name area_calculator and define 3 methods to calculate 3 different areas. Take necessary instance variables and initialize those variables using scanner class

import java.util.Scanner;

class AreaCalculator {
    double radius;
    double side;
    double length;
    double breadth;

    double calculateCircleArea() {
        return Math.PI * radius * radius;
    }

    double calculateSquareArea() {
        return side * side;
    }

    double calculateRectangleArea() {
        return length * breadth;
    }  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        System.out.print("Enter the radius of the circle: ");
        calculator.radius = scanner.nextDouble();

        System.out.print("Enter the side of the square: ");
        calculator.side = scanner.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        calculator.length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        calculator.breadth = scanner.nextDouble();

        double circleArea = calculator.calculateCircleArea();
        double squareArea = calculator.calculateSquareArea();
        double rectangleArea = calculator.calculateRectangleArea();

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);

        scanner.close();
    }
}
