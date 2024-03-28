
// WAP to find largest element of 2x3 array.
import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        int n, m, largest;
        m = 3;
        n = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n:");
        n = sc.nextInt();
        int[][] arr = new int[n][m];
        largest = arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter at i" + i + "j" + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("Largest Element" + largest);
    }
}
