class Rectangle {
    // Data fields
    private double x, y, width, height;

    // Default constructor
    public Rectangle() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    // Parameterized constructor
    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Method to calculate area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to calculate perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Method to check if a point (x, y) is inside the rectangle
    public boolean contains(double x, double y) {
        return (x >= this.x - width / 2 && x <= this.x + width / 2 &&
                y >= this.y - height / 2 && y <= this.y + height / 2);
    }
}

public class Qb40 {
    public static void main(String[] args) {
        // Create default rectangle
        Rectangle rectangle1 = new Rectangle();

        // Create rectangle with specified values
        Rectangle rectangle2 = new Rectangle(3, 4, 6, 8);

        // Test methods for rectangle1
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Contains point (1, 1): " + rectangle1.contains(1, 1));
        System.out.println();

        // Test methods for rectangle2
        System.out.println("Rectangle 2:");
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println("Contains point (5, 6): " + rectangle2.contains(5, 6));
    }
}
