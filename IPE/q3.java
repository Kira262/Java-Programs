import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        double subject1 = scanner.nextDouble();
        System.out.print("Enter marks for Subject 2: ");
        double subject2 = scanner.nextDouble();
        System.out.print("Enter marks for Subject 3: ");
        double subject3 = scanner.nextDouble();

        double totalMarks = subject1 + subject2 + subject3;

        double percentage = (totalMarks / 300) * 100;

        System.out.println("------------- Student Result -------------");
        System.out.println("Subject 1 Marks: " + subject1);
        System.out.println("Subject 2 Marks: " + subject2);
        System.out.println("Subject 3 Marks: " + subject3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}
