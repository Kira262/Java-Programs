import java.util.Scanner;

public class Qb68 {

    // Method to find even and odd numbers in the array
    public static void findEvenOdd(int[] arr) {
        System.out.println("Even numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Call method to find even and odd numbers
        findEvenOdd(numbers);

        scanner.close();
    }
}
