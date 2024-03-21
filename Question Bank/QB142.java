import java.util.Scanner;

public class QB142 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int no = s.nextInt();

        int one = no / 100;
        int two = (no / 10) % 10;
        int three = no % 10;

        // Find the maximum digit
        if (one >= two && one >= three) {
            System.out.println("The maximum digit is: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("The maximum digit is: " + two);
        } else {
            System.out.println("The maximum digit is: " + three);
        }

        // Swap second and third digit if the first digit is in the range of 0 to 5
        if (one >= 0 && one <= 5) {
            int temp = two;
            two = three;
            three = temp;
            System.out.println("After swapping second and third digit: " + one + two + three);
        }

        // Calculate average of first, second, and third digit if the first digit is in
        // the range of 6 to 9
        if (one >= 6 && one <= 9) {
            switch (one) {
                case 6:
                case 7:
                case 8:
                case 9:
                    double average = (one + two + three) / 3.0;
                    System.out.println("Average of first, second, and third digit: " + average);
                    break;
            }
        }
    }
}
