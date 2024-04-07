class Fan {
    // Constants for fan speeds
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    // Data fields
    private int speed;
    private boolean f_on;
    private double radius;
    private String color;

    // Default constructor
    public Fan() {
        speed = SLOW;
        f_on = false;
        radius = 4.0;
        color = "blue";
    }

    // Parameterized constructor
    public Fan(int speed, boolean f_on, double radius, String color) {
        this.speed = speed;
        this.f_on = f_on;
        this.radius = radius;
        this.color = color;
    }

    // Method to display fan description
    public void display() {
        if (f_on) {
            System.out.println("Speed: " + speed);
            System.out.println("Color: " + color);
            System.out.println("Radius: " + radius);
        } else {
            System.out.println("Fan is off");
            System.out.println("Color: " + color);
            System.out.println("Radius: " + radius);
        }
    }
}

public class Qb39 {
    public static void main(String[] args) {
        // Create default fan
        Fan fan1 = new Fan();

        // Create fan with specified values
        Fan fan2 = new Fan(2, true, 6.0, "brown");

        // Display descriptions for both fans
        System.out.println("Fan 1:");
        fan1.display();
        System.out.println();

        System.out.println("Fan 2:");
        fan2.display();
    }
}
