import java.util.Scanner;

public class q28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        try {
            System.out.print("Enter the number of integers (N): ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter integer " + (i + 1) + ": ");
                int num = scanner.nextInt();

                // Check for negative number
                if (num < 0) {
                    throw new IllegalArgumentException("Number is negative: " + num);
                }

                // Check for number divisible by 10
                if (num % 10 == 0) {
                    throw new IllegalArgumentException("Number is evenly divisible by 10: " + num);
                }

                // Check for number greater than 1000 and less than 2000
                if (num > 1000 && num < 2000) {
                    throw new IllegalArgumentException("Number is greater than 1000 and less than 2000: " + num);
                }

                // Check for number greater than 7000
                if (num > 7000) {
                    throw new IllegalArgumentException("Number is greater than 7000: " + num);
                }

                // If no exception is raised, add the number to the sum
                sum += num;
            }

            System.out.println("Total sum of valid numbers: " + sum);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
