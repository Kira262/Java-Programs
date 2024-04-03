// Create interface inheritance . Interface P is extended by P1 & P2.
// Interface P12 inherits from both P1 & P2.
// Each interface declares 1 constant & 1 method.
// Class Q implements P12. Instantiate Q & invoke each of it's methods.
// => Multiple Interface Inheritance.
interface p {
    String um = "KuchbHi";

    default void display() {
        System.out.println("Interface p : String-" + um);
    }
}

interface p1 extends p {
    String um = "hi1";

    default void display() {
        System.out.println("Interface p1 : String-" + um);
    }
}

interface p2 extends p {
    String um = "hi2";

    default void display() {
        System.out.println("Interface p2 : String-" + um);
    }
}

interface p12 extends p1, p2 {
    String um = "h3";

    default void display() {
        System.out.println("Interface p12 : String-" + um);
    }
}

class Q implements p12 {

    public void display() {
        System.out.println("class  p12 ");

    }

    public void displayp12() {
        p12.super.display();
    }
}

class q1 {
    public static void main(String[] args) {
        Q qt = new Q();
        qt.display();
        qt.displayp12();
        p1 a1 = new Q();
        a1.display();
        p2 a2 = new Q();
        a2.display();
        p12 a3 = new Q();
        a3.display();
    }
}