import java.util.Scanner;

class SeriesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.println("Sum of the series 1 + 1/2 + 1/3 + ... + 1/" + n + ": " + sum);

        scanner.close();
    }
}
