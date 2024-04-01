import java.util.Scanner;

public class Qb78 {

    public static void swapValues(int a, int b) {
        // Temporary variable to hold one value during swap
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int secondValue = scanner.nextInt();

        System.out.println("Before swapping: First value = " + firstValue + ", Second value = " + secondValue);

        // Swapping values
        swapValues(firstValue, secondValue);

        System.out.println("After swapping: First value = " + firstValue + ", Second value = " + secondValue);

        scanner.close();
    }
}
