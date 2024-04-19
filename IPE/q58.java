import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

class StudentScoreSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // TreeMap to store scores as keys and names as values
        Map<Integer, String> studentScores = new TreeMap<>();

        // Prompt user to enter names and scores for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter the score of student " + (i + 1) + ": ");
            int score = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            studentScores.put(score, name);
        }

        scanner.close();

        // Print student names in decreasing order of their scores
        System.out.println("Student names in decreasing order of their scores:");
        for (Integer score : studentScores.keySet()) {
            System.out.println(studentScores.get(score) + ": " + score);
        }
    }
}
