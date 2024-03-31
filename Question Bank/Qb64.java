class Student {
    private int rollNo;
    private String name;
    private String mobileNo;

    // Constructor to initialize Student object
    public Student(int rollNo, String name, String mobileNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.mobileNo = mobileNo;
    }

    // Method to print student information
    public void printStudentInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Mobile No: " + mobileNo);
    }
}

public class Qb64 {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[5];

        // Initialize student objects
        students[0] = new Student(1, "John", "1234567890");
        students[1] = new Student(2, "Alice", "9876543210");
        students[2] = new Student(3, "Bob", "4567890123");
        students[3] = new Student(4, "Eve", "7890123456");
        students[4] = new Student(5, "Charlie", "2345678901");

        // Print student information
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + " information:");
            students[i].printStudentInfo();
            System.out.println(); // Add a newline for better readability
        }
    }
}
