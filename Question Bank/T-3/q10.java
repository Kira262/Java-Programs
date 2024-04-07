// Interface A
interface A {
    void methodA();
}

// Interface B extending A
interface B extends A {
    void methodB();
}

// Interface C extending A
interface C extends A {
    void methodC();
}

// Interface D extending B and C
interface D extends B, C {
    void methodD();
}

// Class implementing D
class MyClass implements D {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }

    @Override
    public void methodC() {
        System.out.println("Method C");
    }

    @Override
    public void methodD() {
        System.out.println("Method D");
    }
}

// Main class
public class q10 {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Call methods of MyClass
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
    }
}
