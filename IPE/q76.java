abstract class Vegetable {
    protected String color;

    public Vegetable(String color) {
        this.color = color;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getName();

    @Override
    public String toString() {
        return getName() + " (Color: " + color + ")";
    }
}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Potato";
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Brinjal";
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Tomato";
    }
}

class VegetableDemo {
    public static void main(String[] args) {
        // Create instances of different vegetables
        Vegetable potato = new Potato("Brown");
        Vegetable brinjal = new Brinjal("Purple");
        Vegetable tomato = new Tomato("Red");

        // Display information about each vegetable
        System.out.println("Potato: " + potato);
        System.out.println("Brinjal: " + brinjal);
        System.out.println("Tomato: " + tomato);
    }
}
