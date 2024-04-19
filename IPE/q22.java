import java.util.Scanner;

class SumOfFirstNOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int number = 1; // Start with the first odd number

        while (count < n) {
            sum += number;
            number += 2; // Move to the next odd number
            count++;
        }

        System.out.println("Sum of the first " + n + " odd numbers: " + sum);

        scanner.close();
    }
}
