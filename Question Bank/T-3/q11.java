// Interface A
interface A {
    void methodA();
}

// Interface B
interface B {
    void methodB();
}

// Class C implementing interfaces A and B
class C implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }
}

// Class D extending C
class D extends C {
    public void methodD() {
        System.out.println("Method D");
    }
}

// Main class
public class q11 {
    public static void main(String[] args) {
        // Create an instance of D
        D obj = new D();

        // Call methods of D
        obj.methodA();
        obj.methodB();
        obj.methodD();
    }
}
