import java.util.Scanner;

class EvenNumbersSumAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an array of 10 integers
        int[] numbers = new int[10];

        // Prompt the user to enter data for each element
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Variables to store sum of even numbers and maximum even number
        int sumOfEven = 0;
        int maxEven = Integer.MIN_VALUE; // Initialize maxEven to the smallest possible integer value

        // Loop through the array to sum all even elements and find maximum even number
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                sumOfEven += number;
                if (number > maxEven) {
                    maxEven = number;
                }
            }
        }

        // Display sum of even numbers and maximum even number
        System.out.println("Sum of even numbers: " + sumOfEven);
        if (maxEven != Integer.MIN_VALUE) {
            System.out.println("Maximum even number: " + maxEven);
        } else {
            System.out.println("No even numbers were entered.");
        }

        // Close the scanner
        scanner.close();
    }
}
