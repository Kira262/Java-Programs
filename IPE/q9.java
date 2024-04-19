import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();

        char grade;

        if (percentage > 70) {
            grade = 'A';
        } else if (percentage >= 60 && percentage <= 70) {
            grade = 'B';
        } else if (percentage >= 50 && percentage < 60) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
