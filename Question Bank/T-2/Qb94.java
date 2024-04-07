class noPair {
    int a, b;

    public noPair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int A() {
        return a;
    }

    public int B() {
        return b;
    }
}

public class Qb94 {

    public static int GCD(noPair p) {
        int a = p.A(), b = p.B();

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        noPair p = new noPair(4, 6);
        int ans = GCD(p);
        System.out.println("GCD of " + p.A() + " and " + p.B() + " is: " + ans);
    }

}
