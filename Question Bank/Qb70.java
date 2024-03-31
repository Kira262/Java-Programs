import java.util.Scanner;

public class Qb70 {

    // Method to reverse the elements of the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from start to end until start index is less than end index
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move start index forward and end index backward
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array with the specified size
        int[] numbers = new int[size];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Call method to reverse the array
        reverseArray(numbers);

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
