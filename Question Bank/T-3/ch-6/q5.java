// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double area();
}

// Subclass Triangle
class Triangle extends Shape {
    // Data members
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate area of triangle
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    // Data members
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle
    @Override
    double area() {
        return length * width;
    }
}

// Subclass Circle
class Circle extends Shape {
    // Data member
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class q5 {
    public static void main(String[] args) {
        // Creating objects of Triangle, Rectangle, and Circle
        Triangle triangle = new Triangle(3, 4);
        Rectangle rectangle = new Rectangle(5, 6);
        Circle circle = new Circle(7);

        // Displaying area of each shape
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
