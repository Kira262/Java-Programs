import java.util.Scanner;

class Calcc {
    double x = 10.0;
    double y = 20.0;
    Scanner s = new Scanner(System.in);

    void sum() {
        double s = x + y;
        System.out.println("Sum: " + s);
    }

    double sub() {
        double b = x - y;
        return b;
    }

    void Square(double m) {
        double n = m * m;
        System.out.println("SQuare: " + n);
    }

    double mul(double r, double d) {
        double t = r * d;
        return t;
    }
}

class Main12 {
    public static void main(String[] args) {
        Calcc obj = new Calcc();
        obj.sum();
        System.out.println(obj.sub());
        obj.Square(9);
        System.out.println(obj.mul(2, 5));
    }
}