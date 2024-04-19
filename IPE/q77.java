// Define the interface P
interface P {
    int CONSTANT_P = 10;

    void methodP();
}

// Define the interface P1 extending P
interface P1 extends P {
    int CONSTANT_P1 = 20;

    void methodP1();
}

// Define the interface P2 extending P
interface P2 extends P {
    int CONSTANT_P2 = 30;

    void methodP2();
}

// Define the interface P12 inheriting from both P1 and P2
interface P12 extends P1, P2 {
    int CONSTANT_P12 = 40;

    void methodP12();
}

// Define the class Q implementing P12
class Q implements P12 {
    @Override
    public void methodP() {
        System.out.println("Constant from interface P: " + CONSTANT_P);
    }

    @Override
    public void methodP1() {
        System.out.println("Constant from interface P1: " + CONSTANT_P1);
    }

    @Override
    public void methodP2() {
        System.out.println("Constant from interface P2: " + CONSTANT_P2);
    }

    @Override
    public void methodP12() {
        System.out.println("Constant from interface P12: " + CONSTANT_P12);
    }
}

class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        // Instantiate Q
        Q q = new Q();

        // Invoke each method of Q
        q.methodP();
        q.methodP1();
        q.methodP2();
        q.methodP12();
    }
}
