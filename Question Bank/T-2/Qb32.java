import java.util.Scanner;

class DigitCounter {
    // Method to count digits of an integer number
    int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }
}

public class Qb32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        DigitCounter digitCounter = new DigitCounter();
        int digitCount = digitCounter.countDigits(number);

        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}
