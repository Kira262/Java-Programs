// Superclass Figure
class Figure {
    protected double dimension1;
    protected double dimension2;

    // Constructor
    public Figure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    // Method to compute area
    public double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}

// Subclass Rectangle
class Rectangle extends Figure {
    // Constructor
    public Rectangle(double length, double width) {
        super(length, width);
    }

    // Override area method for Rectangle
    @Override
    public double area() {
        return dimension1 * dimension2;
    }
}

// Subclass Triangle
class Triangle extends Figure {
    // Constructor
    public Triangle(double base, double height) {
        super(base, height);
    }

    // Override area method for Triangle
    @Override
    public double area() {
        return 0.5 * dimension1 * dimension2;
    }
}

class Main {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Create a Triangle object
        Triangle triangle = new Triangle(4, 6);
        System.out.println("Area of Triangle: " + triangle.area());
    }
}
