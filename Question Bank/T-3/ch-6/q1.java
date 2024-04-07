// Interface defining a shape
interface Shape {
    void draw();
}

// Concrete implementation of the Shape interface for a Circle
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

// Concrete implementation of the Shape interface for a Square
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

// Main class to demonstrate runtime polymorphism
public class q1 {
    public static void main(String[] args) {
        // Creating objects of Circle and Square
        Shape circle = new Circle();
        Shape square = new Square();

        // Calling the draw method on Circle object
        circle.draw();

        // Calling the draw method on Square object
        square.draw();
    }
}
