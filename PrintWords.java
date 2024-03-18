
// WAP to enter a number & print in words.
import java.util.Scanner;

public class PrintWords {
    public static void main(String[] args) {
        int n, i, temp, reverse;
        temp = 0;
        reverse = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n:");
        n = sc.nextInt();
        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        while (reverse > 0) {
            temp = reverse % 10;

            switch (temp) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
            }
            reverse = reverse / 10;
        }
    }
}