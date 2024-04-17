import java.util.Hashtable;
import java.util.Scanner;

class StudentGradeLookup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hashtable<String, Integer> studentGrades = new Hashtable<>();

        // Read student names and their grades from the user
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter student names and their grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Student name: ");
            String name = scanner.nextLine();
            System.out.print("Grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            studentGrades.put(name, grade);
        }

        // Prompt the user for a student name and output their grade
        System.out.print("Enter a student name to look up: ");
        String studentName = scanner.nextLine();
        Integer grade = studentGrades.get(studentName);
        if (grade != null) {
            System.out.println("Grade for " + studentName + ": " + grade);
        } else {
            System.out.println("Error: Student '" + studentName + "' not found.");
        }

        scanner.close();
    }
}
