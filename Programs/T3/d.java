class AB {
    int x = 10;

    void get() {
        System.out.println(x);
    }
}

class BC extends AB {
    int x = 20;

    void get() {
        System.out.println(x);
    }
}

class d {
    public static void main(String[] args) {
        // AB a = new AB();
        // BC b = new AB();
        // b = (BC) a;
        // b.get();
    }
}