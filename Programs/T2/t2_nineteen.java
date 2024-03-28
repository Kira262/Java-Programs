class Testt {
    static int a = 10;
    static {
        m1();
    }

    static void m1() {
        System.out.println(j + " ");
    }

    public static void main(String[] args) {
        m1();
        System.out.println(a + " " + k);
    }

    static int k;
    static {
        a = 15;
        k = 5;
    }
    static int j = 10;
}