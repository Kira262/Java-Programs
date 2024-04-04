
// WAP to accept number and raise and handle exceptions for follow cases:
// 1) When number is evenly divisible by 10.
// 2) When a number is greater than 1000 and less than 2000.
// 3) WHen a number is greater than 7000.
// 4) If no exception is there than print message "Everything is not fine"
import java.util.InputMismatchException;
import java.util.Scanner;

class q5 {
    public static void checkNumber(int num) {
        try {
            if (num % 10 == 0) {
                throw new Exception("Number is evenly divisible by 10.");
            } else if (num > 1000 && num < 2000) {
                throw new Exception("Number is greater than 1000 and less than 2000.");
            } else if (num > 7000) {
                throw new Exception("Number is greater than 7000.");
            } else if (num < 0) {
                throw new Exception("Number is negative.");
            } else {
                System.out.println("Everyone is fine!!");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = s.nextInt();
            checkNumber(num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }
        s.close();  
    }
}
