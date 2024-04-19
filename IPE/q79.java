import java.util.Scanner;

abstract class Person {
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

    // Abstract method for display
    public abstract void display();
}

class Student extends Person {
    private String enrollmentCourse;

    // Constructor
    public Student(String name, String address, String phoneNumber, String emailAddress, String enrollmentCourse) {
        super(name, address, phoneNumber, emailAddress);
        this.enrollmentCourse = enrollmentCourse;
    }

    // Method to display student information
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Enrollment Course: " + enrollmentCourse);
    }
}

class Employee extends Person {
    private String office;
    private double salary;
    private String designation;

    // Constructor
    public Employee(String name, String address, String phoneNumber, String emailAddress,
            String office, double salary, String designation) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.designation = designation;
    }

    // Method to display employee information
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Office: " + office);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
}

class DemoPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.println("Enter Student Details:");
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

        // Create Student object
        Student student = new Student(studentName, studentAddress, studentPhoneNumber,
                studentEmailAddress, enrollmentCourse);

        // Input employee details
        System.out.println("\nEnter Employee Details:");
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
        scanner.nextLine(); // Consume newline character
        System.out.print("Designation: ");
        String designation = scanner.nextLine();

        // Create Employee object
        Employee employee = new Employee(employeeName, employeeAddress, employeePhoneNumber,
                employeeEmailAddress, office, salary, designation);

        // Display student and employee information
        System.out.println("\nStudent Information:");
        student.display();
        System.out.println("\nEmployee Information:");
        employee.display();

        scanner.close();
    }
}
