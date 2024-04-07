import java.util.Arrays;

public class Qb66 {

    // Method to sort the array
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 1, 3 };

        // Print unsorted array
        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array
        sortArray(numbers);

        // Print sorted array
        printArray(numbers);
    }
}
