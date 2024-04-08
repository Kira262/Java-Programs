import java.util.Scanner;

class RowSumThread extends Thread {
    private int[] row;
    private int sum;

    public RowSumThread(int[] row) {
        this.row = row;
        this.sum = 0;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int value : row) {
            sum += value;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the number of columns (n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        RowSumThread[] threads = new RowSumThread[m];
        for (int i = 0; i < m; i++) {
            threads[i] = new RowSumThread(matrix[i]);
            threads[i].start();
        }

        System.out.println("Results:");
        for (int i = 0; i < m; i++) {
            try {
                threads[i].join();
                System.out.println("Sum of elements in row " + (i + 1) + ": " + threads[i].getSum());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}
