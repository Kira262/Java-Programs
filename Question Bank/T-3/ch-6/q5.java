// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double area();
}

// Subclass Triangle
class Triangle extends Shape {
    // Data members
    double base;
    double height;

    // Constructor
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate area of triangle

    double area() {
        return 0.5 * base * height;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    // Data members
    int length;
    int width;

    // Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of rectangle

    double area() {
        return length * width;
    }
}

// Subclass Circle
class Circle extends Shape {
    // Data member
    int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle

    double area() {
        return Math.PI * radius * radius;
    }
}

// Main class
class q5 {
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
