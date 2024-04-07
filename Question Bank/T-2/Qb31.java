class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Qb31 {
    public static void main(String[] args) {
        double radius = 5;
        Circle circle = new Circle(radius);

        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();

        System.out.println("Area of the circle: " + area + " square units");
        System.out.println("Perimeter of the circle: " + perimeter + " units");
    }
}
