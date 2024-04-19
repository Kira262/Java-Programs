import java.util.Scanner;

class CountElements {
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

        // Count the number of positive, negative, and zero elements
        int positiveCount = countPositiveElements(matrix);
        int negativeCount = countNegativeElements(matrix);
        int zeroCount = countZeroElements(matrix);

        // Display the counts
        System.out.println("Number of positive elements: " + positiveCount);
        System.out.println("Number of negative elements: " + negativeCount);
        System.out.println("Number of zero elements: " + zeroCount);

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

    // Method to count positive elements in the matrix
    public static int countPositiveElements(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Method to count negative elements in the matrix
    public static int countNegativeElements(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    // Method to count zero elements in the matrix
    public static int countZeroElements(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
