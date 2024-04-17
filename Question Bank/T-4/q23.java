import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + "]";
    }
}

class StudentManagementSystem {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search for Student");
            System.out.println("4. Sort Students by Name");
            System.out.println("5. Sort Students by Grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    sortStudentsByName();
                    break;
                case 5:
                    sortStudentsByGrade();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 6.");
            }
        }
    }

    private static void addStudent() {
        System.out.println("\nAdding Student");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student newStudent = new Student(name, grade);
        studentList.add(newStudent);
        System.out.println("Student added successfully!");
    }

    private static void removeStudent() {
        System.out.println("\nRemoving Student");
        if (studentList.isEmpty()) {
            System.out.println("No students to remove!");
            return;
        }

        System.out.print("Enter the name of the student to remove: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                studentList.remove(student);
                found = true;
                System.out.println("Student removed successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    private static void searchStudent() {
        System.out.println("\nSearching for Student");
        if (studentList.isEmpty()) {
            System.out.println("No students to search!");
            return;
        }

        System.out.print("Enter the name of the student to search: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student found: " + student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    private static void sortStudentsByName() {
        System.out.println("\nSorting Students by Name");
        Collections.sort(studentList, Comparator.comparing(Student::getName));
        System.out.println("Students sorted by name successfully!");
        displayStudents();
    }

    private static void sortStudentsByGrade() {
        System.out.println("\nSorting Students by Grade");
        Collections.sort(studentList, Comparator.comparingInt(Student::getGrade).reversed());
        System.out.println("Students sorted by grade successfully!");
        displayStudents();
    }

    private static void displayStudents() {
        System.out.println("\nStudent List:");
        if (studentList.isEmpty()) {
            System.out.println("No students to display!");
            return;
        }

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
