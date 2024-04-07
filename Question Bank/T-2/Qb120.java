public class Qb120 {
    int x, y;

    public Qb120() {
        this.x = 5;
        this.y = 5;
    }

    public Qb120(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Qb120(Qb120 o) {
        this.x = o.x;
        this.y = o.y;
    }

    public int gx() {
        return x;
    }

    public int gy() {
        return y;
    }

    public void sx(int x) {
        this.x = x;
    }

    public void sy(int y) {
        this.y = y;
    }

    public void display() {
        System.out.println("Qb120 coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        Qb120 def = new Qb120();
        System.out.println("Default Qb120:");
        def.display();

        Qb120 us = new Qb120(10, 20);
        System.out.println("\nUser-defined Qb120:");
        us.display();

        Qb120 copy = new Qb120(us);
        System.out.println("\nCopied Qb120:");
        copy.display();
    }
}
