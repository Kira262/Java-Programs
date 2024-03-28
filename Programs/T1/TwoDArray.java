
// WAP to initialize 2D Array & Take Value Of Each Element from the User.
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n:");
        n = sc.nextInt();
        int[][] arr = new int[n][n];
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
    }
}
