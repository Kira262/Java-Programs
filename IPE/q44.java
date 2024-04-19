import java.util.Scanner;

class MatrixTranspose {
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

        // Find the transpose of the matrix
        int[][] transposeMatrix = findTranspose(matrix);

        // Display the transpose of the matrix
        System.out.println("Transpose of the matrix:");
        printMatrix(transposeMatrix);

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

    // Method to find the transpose of the matrix
    public static int[][] findTranspose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
