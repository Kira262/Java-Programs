class A {
    void m1() {
        System.out.println("Parents");
    }
}

class B extends A {
    void m1() {
        System.out.println("Child B");
    }
}

class C extends A {
    void m1() {
        System.out.println("Child C");
    }
}

class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        // A temp = new B();  
        // A temp = new C();
        a.m1();
        b.m1();
        c.m1();
    }
}