import java.util.Scanner;

// Abstract class Person
abstract class Person {
    // Data members
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String emailAddress;

    // Constructor
    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Abstract method for displaying information
    abstract void display();
}

// Subclass Student
class Student extends Person {
    // Additional data member
    private String enrollmentCourse;

    // Constructor
    public Student(String name, String address, String phoneNumber, String emailAddress, String enrollmentCourse) {
        super(name, address, phoneNumber, emailAddress);
        this.enrollmentCourse = enrollmentCourse;
    }

    // Method to display student information
    @Override
    void display() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Enrollment Course: " + enrollmentCourse);
    }
}

// Subclass Employee
class Employee extends Person {
    // Additional data members
    private String office;
    private double salary;
    private String designation;

    // Constructor
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
            String designation) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.designation = designation;
    }

    // Method to display employee information
    @Override
    void display() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Office: " + office);
        System.out.println("Salary: $" + salary);
        System.out.println("Designation: " + designation);
    }
}

// Main class
public class q4 {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input for student
        System.out.println("Enter Student Information:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Address: ");
        String studentAddress = scanner.nextLine();
        System.out.print("Phone Number: ");
        String studentPhoneNumber = scanner.nextLine();
        System.out.print("Email Address: ");
        String studentEmailAddress = scanner.nextLine();
        System.out.print("Enrollment Course: ");
        String enrollmentCourse = scanner.nextLine();

        // Creating student object
        Student student = new Student(studentName, studentAddress, studentPhoneNumber, studentEmailAddress,
                enrollmentCourse);

        // Input for employee
        System.out.println("\nEnter Employee Information:");
        System.out.print("Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Address: ");
        String employeeAddress = scanner.nextLine();
        System.out.print("Phone Number: ");
        String employeePhoneNumber = scanner.nextLine();
        System.out.print("Email Address: ");
        String employeeEmailAddress = scanner.nextLine();
        System.out.print("Office: ");
        String office = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Designation: ");
        String designation = scanner.nextLine();

        // Creating employee object
        Employee employee = new Employee(employeeName, employeeAddress, employeePhoneNumber, employeeEmailAddress,
                office, salary, designation);

        // Displaying student and employee information
        System.out.println("\nDisplaying Information:");
        student.display();
        System.out.println();
        employee.display();

        // Close scanner
        scanner.close();
    }
}
