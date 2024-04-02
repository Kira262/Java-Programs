class Std {
    int x = 10;

    void get() {
        System.out.println(x);
    }
}

class Std1 extends Std {
    int x = 20;

    void get() {
        System.out.println(x);
    }
}

class e {
    public static void main(String[] args) {
        Std s1 = new Std();
        System.out.println(s1 instanceof Std);
        Std s2 = new Std1();
        System.out.println(s2 instanceof Std);
        System.out.println(s2 instanceof Std1);
        System.out.println(s1 instanceof Std1);
        Std s3 = null;
        System.out.println(s3 instanceof Std);
    }
}