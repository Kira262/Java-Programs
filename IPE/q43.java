import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the size of the matrices
        int rowsA, columnsA, rowsB, columnsB;

        System.out.println("Enter the dimensions of matrix A (rows columns): ");
        rowsA = scanner.nextInt();
        columnsA = scanner.nextInt();

        System.out.println("Enter the dimensions of matrix B (rows columns): ");
        rowsB = scanner.nextInt();
        columnsB = scanner.nextInt();

        // Check if the matrices can be multiplied
        if (columnsA != rowsB) {
            System.out.println(
                    "Matrices cannot be multiplied. Number of columns in A must be equal to number of rows in B.");
        }

        // Create the matrices
        int[][] matrixA = new int[rowsA][columnsA];
        int[][] matrixB = new int[rowsB][columnsB];

        // Prompt the user to enter data for matrix A
        System.out.println("Enter elements of matrix A:");
        readMatrix(scanner, matrixA);

        // Prompt the user to enter data for matrix B
        System.out.println("Enter elements of matrix B:");
        readMatrix(scanner, matrixB);

        // Multiply the matrices
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Display the result
        System.out.println("Resultant matrix C = A * B:");
        printMatrix(resultMatrix);

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

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][columnsB];

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
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
