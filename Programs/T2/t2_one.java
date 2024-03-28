class Calculate {
    // int x = 10;
    // int y = 20;
    int x, y;

    void sum() {
        int z = x + y;
        System.out.println("Sum= " + z);
    }

    void sub() {
        int s = x - y;
        System.out.println("Sub= " + s);

    }
}

class Main {
    public static void main(String[] args) {
        Calculate ob = new Calculate();
        ob.sum();
        ob.sub();
    }
}