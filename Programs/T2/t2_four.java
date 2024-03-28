import java.util.Scanner;

class Calc {
    static int x;
    int y;
    Scanner s = new Scanner(System.in);

    void init() {
        System.out.print("Enter x: ");
        x = s.nextInt();
        System.out.print("Enter y: ");
        y = s.nextInt();

    }
}

class Main67 {
    public static void main(String[] args) {
        Calc ob1 = new Calc();
        ob1.init();
        Calc ob2 = new Calc();
        ob2.init();
        // System.out.println(ob1.x);
        System.out.println(ob1.y);
        // System.out.println(ob2.x);
        System.out.println(ob2.y);
    } 
}