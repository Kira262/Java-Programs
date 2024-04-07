// Define a user-defined exception MyException
class MyException extends Exception {
    // Constructor
    public MyException(String message) {
        super(message);
    }
}

// Define class ExceptionDemo
class ExceptionDemo {
    // Method compute(int a) that throws MyException if a is greater than 10
    public void compute(int a) throws MyException {
        if (a > 10) {
            throw new MyException("Number greater than 10 encountered: " + a);
        } else {
            System.out.println("Number is less than or equal to 10: " + a);
        }
    }
}

// Main class
public class q21 {
    public static void main(String[] args) {
        // Create an instance of ExceptionDemo
        ExceptionDemo demo = new ExceptionDemo();

        try {
            // Call compute method with argument greater than 10
            demo.compute(15);
        } catch (MyException e) {
            // Catch and handle MyException
            System.out.println("Caught MyException: " + e.getMessage());
        }
    }
}
