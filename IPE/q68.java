import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

class NumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        int sum = 0;

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            try {
                int num = scanner.nextInt();
                processNumber(num);
                sum += num;
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage() + " Skipping this number.");
            }
        }

        System.out.println("Total sum of valid numbers: " + sum);
        scanner.close();
    }

    public static void processNumber(int num) throws InvalidNumberException {
        if (num < 0) {
            throw new InvalidNumberException("Negative number encountered.");
        } else if (num % 10 == 0) {
            throw new InvalidNumberException("Number divisible by 10 encountered.");
        } else if (num > 1000 && num < 2000) {
            throw new InvalidNumberException("Number between 1000 and 2000 encountered.");
        } else if (num > 7000) {
            throw new InvalidNumberException("Number greater than 7000 encountered.");
        }
    }
}
