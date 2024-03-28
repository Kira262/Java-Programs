
// WAP to find sum of even numbers btw 1 to n take value of n from user.
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int n, i, sum;
        i = 0;
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n:");
        n = sc.nextInt();
        while (i <= n - 1) {
            i = i + 2;
            sum = sum + i;
        }
        System.out.println("Sum of Even Number is: " + sum);
    }
}
