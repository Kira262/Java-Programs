import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of size N
        int[] numbers = new int[size];

        // Prompt the user to enter data for each element
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print the elements of the array in reverse order
        System.out.println("Elements of the array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
