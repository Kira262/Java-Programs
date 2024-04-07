// Interface University
interface University {
    void takeExam();
}

// Interface State
interface State {
    String getName();
}

// Interface StateUniversity extending University and State
interface StateUniversity extends University, State {
    default void print() {
        System.out.println("Inside StateUniversity");
    }
}

// Class TestState implementing StateUniversity
class TestState implements StateUniversity {
    @Override
    public void takeExam() {
        System.out.println("Taking exam...");
    }

    @Override
    public String getName() {
        return "Some State";
    }
}

// Main class
public class q9 {
    public static void main(String[] args) {
        // Create an instance of TestState
        TestState testState = new TestState();

        // Call methods of TestState
        testState.takeExam();
        System.out.println("State name: " + testState.getName());
        testState.print();
    }
}
