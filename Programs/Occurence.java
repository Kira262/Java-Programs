
// WAP to count Occurence of given character.
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input:");
        String S1 = sc.nextLine();
        System.out.print("Enter Occurence Character:");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < S1.length(); i++) {
            if (ch == S1.charAt(i)) {
                count++;
            }
        }
        System.out.println("Occurence of Given Character"+count);
    }
}