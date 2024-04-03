class AA {
    int x = 10;

    void get() {
        System.out.println(x);
    }
}

class BB extends AA {
    int x = 20;

    void get() {
        System.out.println(x);
    }
}

class CC extends AA {
    int x = 30;

    void get() {
        System.out.println(x);
    }
}

class b {
    public static void main(String[] args) {
        AA a = new AA();
        BB bb = new BB();
        CC c = new CC();
        System.out.println(a.x);
        a = bb;
        System.out.println(a.x);
        a = c;
        System.out.println(a.x);

    }
}