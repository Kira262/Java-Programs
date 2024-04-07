// Declare interface I1
interface I1 {
    // Method
    void methodI1();
}

// Declare interface I2
interface I2 {
    // Method
    void methodI2();
}

// Declare interface I3 extending I1 and I2
interface I3 extends I1, I2 {
    // No additional methods
}

// Declare interface I4
interface I4 {
    // Method
    void methodI4();
}

// Class X implementing I3
class X implements I3 {
    // Implement methods from I1 and I2
    @Override
    public void methodI1() {
        System.out.println("Method from I1 implemented in class X");
    }

    @Override
    public void methodI2() {
        System.out.println("Method from I2 implemented in class X");
    }
}

// Class W extending X and implementing I4
class W extends X implements I4 {
    // Implement method from I4
    @Override
    public void methodI4() {
        System.out.println("Method from I4 implemented in class W");
    }
}

// Main class
public class q16 {
    public static void main(String[] args) {
        // Create an object of class W
        W obj = new W();

        // Check if the object implements each interface and is of type X
        System.out.println("Object implements I1: " + (obj instanceof I1));
        System.out.println("Object implements I2: " + (obj instanceof I2));
        System.out.println("Object implements I3: " + (obj instanceof I3));
        System.out.println("Object implements I4: " + (obj instanceof I4));
        System.out.println("Object is of type X: " + (obj instanceof X));
    }
}
