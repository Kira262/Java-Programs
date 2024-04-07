import java.util.Scanner;

public class Qb79 {
    public static void swapValues(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int firstValue = scanner.nextInt();

        System.out.print("Enter the second value: ");
        int secondValue = scanner.nextInt();

        System.out.println("Before swapping: First value = " + firstValue + ", Second value = " + secondValue);

        // Creating an array to hold the values
        int[] values = { firstValue, secondValue };

        // Swapping values
        swapValues(values, 0, 1);

        // Getting the swapped values from the array
        firstValue = values[0];
        secondValue = values[1];

        System.out.println("After swapping: First value = " + firstValue + ", Second value = " + secondValue);

        scanner.close();
    }

}
