import java.util.Scanner;

class Calculate {
    int x;
    int y;
    Scanner sc = new Scanner(System.in);

    void sum() {
        System.out.println("x: ");
        x = sc.nextInt();
        System.out.println("y: ");
        y = sc.nextInt();
        int z = x + y;
        System.out.println("SUM: " + z);
    }

    void sub() {
        int s = x - y;
        System.out.println("SUB: " + s);
        // System.out.println("SUM: " + z);
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}

class Main {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.sum();
        obj.sub();
    }
}