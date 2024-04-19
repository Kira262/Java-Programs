import java.util.Scanner;

class MaxElementMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the matrix
        int rows = 3;
        int columns = 3;

        // Create the matrix
        int[][] matrix = new int[rows][columns];

        // Prompt the user to enter data for the matrix
        System.out.println("Enter elements of the matrix:");
        readMatrix(scanner, matrix);

        // Find the maximum element
        int maxElement = findMaxElement(matrix);

        // Display the maximum element
        System.out.println("Maximum element in the matrix: " + maxElement);

        // Close the scanner
        scanner.close();
    }

    // Method to read matrix elements from the user
    public static void readMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to find the maximum element in the matrix
    public static int findMaxElement(int[][] matrix) {
        int maxElement = matrix[0][0]; // Initialize maxElement with the first element of the matrix

        // Traverse through the matrix to find the maximum element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }

        return maxElement;
    }
}
