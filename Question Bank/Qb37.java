class MyClass {
    int n1 = 10;
    int n2 = 20;

    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    int subtract(int a, int b) {
        return a - b;
    }
}

public class Qb37 {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();

        // Accessing variables with different names
        System.out.println("Number 1: " + myObj.n1);
        System.out.println("Number 2: " + myObj.n2);

        // Accessing methods with different names
        int sum = myObj.add(myObj.n1, myObj.n2);
        System.out.println("Sum: " + sum);

        int difference = myObj.subtract(myObj.n1, myObj.n2);
        System.out.println("Difference: " + difference);
    }
}
