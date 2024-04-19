import java.util.Scanner;

class OddEvenWithoutElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is Even");
        }
        System.out.println("Number is Odd");

        scanner.close();
    }
}
// import java.util.Scanner;

// public class OddEvenWithElse {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter a number: ");
// int number = scanner.nextInt();

// if (number % 2 == 0) {
// System.out.println("Number is Even");
// } else {
// System.out.println("Number is Odd");
// }

// scanner.close();
// }
// }
