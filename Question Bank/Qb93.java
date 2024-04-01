class Powp {
    int n, pow;

    public Powp(int n, int pow) {
        this.n = n;
        this.pow = pow;
    }

    public int getN() {
        return n;
    }

    public int getP() {
        return pow;
    }
}

public class Qb93 {

    public static int calculatePower(Powp params) {
        int n = params.getN(), pow = params.getP(), result = 1;

        for (int i = 0; i < pow; i++) {
            result *= n;
        }

        return result;
    }

    public static void main(String[] args) {
        Powp params = new Powp(5, 3);
        int result = calculatePower(params);
        System.out.println(params.getN() + " raised to the pow of " + params.getP() + " is: " + result);
    }

}
