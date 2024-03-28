// WAP to find sum of two matrix and store to another matrix.
//find sum of two matrix & store to anther matrix

import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrices: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat1 = new int[r][c];
        int[][] mat2 = new int[r][c];
        int[][] sum = new int[r][c];
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
