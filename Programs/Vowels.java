
// WAP to accept String & count the number of vowels present in a string.
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input:");
        String S1 = sc.nextLine();
        int count = 0;
        for (int i = 0; i < S1.length(); i++) {
            if (S1.charAt(i) == 'a' || S1.charAt(i) == 'e' || S1.charAt(i) == 'i' || S1.charAt(i) == 'o'
                    || S1.charAt(i) == 'u' ||
                    S1.charAt(i) == 'A' || S1.charAt(i) == 'E' || S1.charAt(i) == 'I' || S1.charAt(i) == 'O'
                    || S1.charAt(i) == 'U') {
                count++;
            }
        }
        System.out.println("Vowels Of Given Word: " + count);
    }
}