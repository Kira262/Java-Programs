import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
// import java.util.Scanner;

// public class PrimeNumbersInRange {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the value of n: ");
// int n = scanner.nextInt();

// System.out.println("Prime numbers between 1 and " + n + ":");
// for (int i = 2; i <= n; i++) {
// if (isPrime(i)) {
// System.out.print(i + " ");
// }
// }

// scanner.close();
// }

// // Method to check if a number is prime
// public static boolean isPrime(int num) {
// if (num <= 1) {
// return false;
// }
// for (int i = 2; i <= Math.sqrt(num); i++) {
// if (num % i == 0) {
// return false;
// }
// }
// return true;
// }
// }
