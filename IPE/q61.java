class Rect {
    private double width;
    private double height;

    public Rect() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {

        Rect defaultRectangle = new Rect();
        System.out.println("Area of default rectangle: " + defaultRectangle.getArea());
        System.out.println("Perimeter of default rectangle: " + defaultRectangle.getPerimeter());

        Rect customRectangle = new Rect(5.0, 3.0);
        System.out.println("Area of custom rectangle: " + customRectangle.getArea());
        System.out.println("Perimeter of custom rectangle: " + customRectangle.getPerimeter());
    }
}
