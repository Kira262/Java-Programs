import java.util.Scanner;

class SwapWithTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();
    }
}
// import java.util.Scanner;

// public class SwapWithoutTemp {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the first number: ");
// int num1 = scanner.nextInt();
// System.out.print("Enter the second number: ");
// int num2 = scanner.nextInt();

// System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

// // Swapping without temporary variable
// num1 = num1 + num2;
// num2 = num1 - num2;
// num1 = num1 - num2;

// System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

// scanner.close();
// }
// }
