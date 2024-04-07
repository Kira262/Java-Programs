// Interface A
interface A {
    void methodA();
}

// Interface B
interface B {
    void methodB();
}

// Interface C
interface C {
    void methodC();
}

// Interface D extending A, B, and C
interface D extends A, B, C {
    void methodD();
}

// Interface E extending D
interface E extends D {
    void methodE();
}

// Class implementing interface E
class MyClass implements E {
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

    @Override
    public void methodE() {
        System.out.println("Method E");
    }
}

// Main class
public class q14 {
    public static void main(String[] args) {
        // Create an instance of MyClass
        MyClass obj = new MyClass();

        // Call methods of MyClass
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
        obj.methodE();
    }
}
