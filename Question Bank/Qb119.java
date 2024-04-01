public class Qb119 {
    int x, y;

    public Qb119() {
        this.x = 5;
        this.y = 5;
    }

    public Qb119(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void display() {
        System.out.println("Qb119 coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        Qb119 def = new Qb119();
        System.out.println("Default Qb119:");
        def.display();

        Qb119 user = new Qb119(10, 20);
        System.out.println("\nUser-defined Qb119:");
        user.display();

        System.out.println("\nAfter changing coordinates using setter methods:");
        user.setX(15);
        user.setY(25);
        user.display();
    }
}
