// Interface A
interface A {
    int CONSTANT_A = 10; // Constant

    void methodA(); // Method
}

// Interface A1 extends A
interface A1 extends A {
    int CONSTANT_A1 = 20; // Constant
}

// Interface A2 extends A
interface A2 extends A {
    int CONSTANT_A2 = 30; // Constant
}

// Interface A12 inherits from A1 and A2
interface A12 extends A1, A2 {
    // No additional constants or methods
}

// Class B implements A12
class B implements A12 {
    // Implementation of methodA from interface A
    @Override
    public void methodA() {
        System.out.println("MethodA is invoked from interface A");
    }
}

// Main class
public class q8 {
    public static void main(String[] args) {
        // Instantiate B
        B b = new B();

        // Invoke methods from B
        b.methodA();

        // Display constants from interfaces
        System.out.println("CONSTANT_A: " + A.CONSTANT_A);
        System.out.println("CONSTANT_A1: " + A1.CONSTANT_A1);
        System.out.println("CONSTANT_A2: " + A2.CONSTANT_A2);
    }
}
