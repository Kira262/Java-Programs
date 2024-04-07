// Define a user-defined exception MyException
class MyException extends Exception {
    // Constructor
    public MyException(String message) {
        super(message);
    }
}

// Define class ExceptionDemo
class ExceptionDemo {
    // Method compute() that throws MyException for specific conditions
    public void compute(int num) throws MyException {
        if (num % 7 == 0 && num % 5 != 0) {
            throw new MyException("Number is divisible by 7 but not divisible by 5: " + num);
        } else {
            System.out.println("Number is not divisible by 7 or is divisible by 5: " + num);
        }
    }
}

// Main class
public class q23 {
    public static void main(String[] args) {
        // Create an instance of ExceptionDemo
        ExceptionDemo demo = new ExceptionDemo();

        try {
            // Call compute method with argument divisible by 7 but not divisible by 5
            demo.compute(14);
        } catch (MyException e) {
            // Catch and handle MyException
            System.out.println("Caught MyException: " + e.getMessage());
        }
    }
}
