import java.util.Scanner;

class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        int numerator = 1;
        int denominator = 3; // Start with the second term

        for (int i = 0; i < n; i++) {
            sum += (double) numerator / denominator;
            numerator += 2; // Move to the next odd number
            denominator += 2; // Move to the next odd number
        }

        System.out.println("Sum of the first " + n + " terms of the series: " + sum);

        scanner.close();
    }
}
