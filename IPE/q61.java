class Rectangle {
    private double width;
    private double height;

    // No-arg constructor to create a default rectangle
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor to create a rectangle with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate and return the area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Method to calculate and return the perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter method for height
    public double getHeight() {
        return height;
    }

    // Setter method for height
    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        // Creating a default rectangle
        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Area of default rectangle: " + defaultRectangle.getArea());
        System.out.println("Perimeter of default rectangle: " + defaultRectangle.getPerimeter());

        // Creating a rectangle with specified width and height
        Rectangle customRectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area of custom rectangle: " + customRectangle.getArea());
        System.out.println("Perimeter of custom rectangle: " + customRectangle.getPerimeter());
    }
}
