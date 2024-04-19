import java.util.Scanner;

class MinValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the array
        int rows = 3;
        int columns = 3;

        // Create the array
        int[][] array = new int[rows][columns];

        // Prompt the user to enter data for the array
        System.out.println("Enter elements of the array:");
        readArray(scanner, array);

        // Find the minimum value
        int minValue = findMinValue(array);

        // Display the minimum value
        System.out.println("Minimum value in the array: " + minValue);

        // Close the scanner
        scanner.close();
    }

    // Method to read array elements from the user
    public static void readArray(Scanner scanner, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to find the minimum value in the array
    public static int findMinValue(int[][] array) {
        int minValue = array[0][0]; // Initialize minValue with the first element of the array

        // Traverse through the array to find the minimum value
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < minValue) {
                    minValue = array[i][j];
                }
            }
        }

        return minValue;
    }
}
