import java.util.Scanner;

class PalindromeChecker {
    // Method to check if a number is palindrome
    boolean isPal(int number) {
        int revd = 0;
        int og_no = number;

        while (number > 0) {
            int digit = number % 10;
            revd = revd * 10 + digit;
            number /= 10;
        }

        return og_no == revd;
    }
}

public class Qb34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        PalindromeChecker palCHecker = new PalindromeChecker();
        boolean isPal = palCHecker.isPal(number);

        if (isPal) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }

        scanner.close();
    }
}
