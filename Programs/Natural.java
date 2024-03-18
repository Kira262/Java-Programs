
// WAP to print all natural numbers from 1 to n using:
// 1.)while loop.
// 2.)for loop.
// 3.)Do While loop.
// Take value of n from the user.
import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        int n, i;
        i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n:");
        n = sc.nextInt();
        // while (i <= n) {
        //     System.out.println(i);
        //     i++;
        // }
        // for(i=1;i<=n;i++)
        // {
        //     System.out.println(i);
        // }
        do {
            System.out.println(i);
            i++;
        } while (i<=n);
    }
}
