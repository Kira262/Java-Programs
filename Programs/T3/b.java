class A {
    int x = 10;

    void get() {
        System.out.println(x);
    }
}

class B extends A {
    int x = 20;

    void get() {
        System.out.println(x);
    }
}

class C extends A {
    int x = 30;

    void get() {
        System.out.println(x);
    }
}

class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println(a.x);
        a = b;
        System.out.println(a.x);
        a = c;
        System.out.println(a.x);

    }
}