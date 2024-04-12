// Interface for shapes
interface Shape {
    double calculateArea();
}

// Interface for circles
interface Circle extends Shape {
    double radius = 0;

    // Method to set radius
    void setRadius(double radius);
}

// Interface for squares
interface Square extends Shape {
    double side = 0;

    // Method to set side
    void setSide(double side);
}

// Class implementing Circle interface
class CircleImpl implements Circle {
    double radius;

    // Method to set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Class implementing Square interface
class SquareImpl implements Square {
    double side;

    // Method to set side
    public void setSide(double side) {
        this.side = side;
    }

    // Method to calculate area of square
    public double calculateArea() {
        return side * side;
    }
}

// Main class
public class q7 {
    public static void main(String[] args) {
        // Creating objects of CircleImpl and SquareImpl
        CircleImpl circle = new CircleImpl();
        SquareImpl square = new SquareImpl();

        // Setting radius and side
        circle.setRadius(5);
        square.setSide(4);

        // Calculating and displaying areas
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
    }
}
