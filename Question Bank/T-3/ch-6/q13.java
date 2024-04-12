// Interface Polygon
interface Polygon {
    // Abstract method
    double getArea();

    // Default method
    default int getSides() {
        return 4;
    }
}

// Rectangle class implementing Polygon
class Rectangle implements Polygon {
    double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of getArea() method
    public double getArea() {
        return length * width;
    }

    // Overriding getSides() method
    public int getSides() {
        return 4;
    }
}

// Square class implementing Polygon
class Square implements Polygon {
    double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Implementation of getArea() method
    public double getArea() {
        return side * side;
    }
}

// Main class
public class q13 {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5, 4);

        // Call getSides() method using Rectangle object
        System.out.println("Sides of Rectangle: " + rectangle.getSides()); // Overridden method is called

        // Create a Square object
        Square square = new Square(5);

        // Call getSides() method using Square object
        System.out.println("Sides of Square: " + square.getSides()); // Default method is called
    }
}
