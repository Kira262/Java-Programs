import java.util.Scanner;

class RowSumThread extends Thread {
    private int[] row;
    private int sum;

    public RowSumThread(int[] row) {
        this.row = row;
    }

    public void run() {
        for (int num : row) {
            sum += num;
        }
    }

    public int getSum() {
        return sum;
    }
}

class MatrixRowSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();

        // Input matrix elements
        int[][] matrix = new int[m][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create threads and compute row sums
        RowSumThread[] threads = new RowSumThread[m];
        for (int i = 0; i < m; i++) {
            threads[i] = new RowSumThread(matrix[i]);
            threads[i].start();
        }

        // Wait for all threads to finish and print results
        try {
            for (int i = 0; i < m; i++) {
                threads[i].join();
                System.out.println("Sum of elements in row " + (i + 1) + ": " + threads[i].getSum());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
