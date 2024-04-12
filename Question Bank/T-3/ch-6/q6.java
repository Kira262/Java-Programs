// Abstract class Vegetable
abstract class Vegetable {
    // Instance variable to indicate color
    String color;

    // Constructor
    public Vegetable(String color) {
        this.color = color;
    }

    // Abstract method to be implemented by subclasses
    abstract String getName();

    // Overriding toString() method to return name and color of vegetable

    public String toString() {
        return getName() + " (Color: " + color + ")";
    }
}

// Subclass Potato
class Potato extends Vegetable {
    // Constructor
    public Potato(String color) {
        super(color);
    }

    // Implementation of abstract method getName() for Potato

    String getName() {
        return "Potato";
    }
}

// Subclass Brinjal
class Brinjal extends Vegetable {
    // Constructor
    public Brinjal(String color) {
        super(color);
    }

    // Implementation of abstract method getName() for Brinjal

    String getName() {
        return "Brinjal";
    }
}

// Subclass Tomato
class Tomato extends Vegetable {
    // Constructor
    public Tomato(String color) {
        super(color);
    }

    // Implementation of abstract method getName() for Tomato

    String getName() {
        return "Tomato";
    }
}

// Main class
public class q6 {
    public static void main(String[] args) {
        // Creating instances of different vegetable objects
        Vegetable potato = new Potato("Brown");
        Vegetable brinjal = new Brinjal("Purple");
        Vegetable tomato = new Tomato("Red");

        // Displaying information about each vegetable
        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}
