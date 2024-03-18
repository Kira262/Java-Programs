// WAP to multiply first and last digit of a number.
import java.util.Scanner;

public class Multiply {
    public static void main(String args[]) {
        int n, fd, ld, mul, i, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        i = 0;
        n = sc.nextInt();
        fd = 0;
        ld = n % 10;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            i++;
        }
        while (n > 0) {
            fd = n % 10;
            n = n / 10;
        }
        mul = fd * ld;
        System.out.println("First digit=" + fd);
        System.out.println("Last digit=" + ld);
        System.out.println("Multiply of first and last digit=" + mul);
    }
}