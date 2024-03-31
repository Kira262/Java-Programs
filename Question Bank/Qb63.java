class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Qb63 {
    public static void main(String[] args) {
        // Create an array of objects
        MyClass[] objectArray = new MyClass[5];

        // Initialize objects in the array
        for (int i = 0; i < objectArray.length; i++) {
            objectArray[i] = new MyClass(i + 1);
        }

        // Access and print values of objects in the array
        for (int i = 0; i < objectArray.length; i++) {
            System.out.println("Object " + (i + 1) + ": " + objectArray[i].getValue());
        }
    }
}
