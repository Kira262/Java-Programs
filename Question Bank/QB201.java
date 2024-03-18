// WAP to reverse a number.
import java.util.Scanner;

public class QB201 {
    public static void main(String[] args) {
        int reverse=0,num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        num = sc.nextInt();
        while (num!= 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}