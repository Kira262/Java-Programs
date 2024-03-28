// WAP to reverse a number.
import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input:");
        String S = sc.nextLine();
        String rev = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            rev = rev + S.charAt(i);
        }
        System.out.println(rev);
    }
}