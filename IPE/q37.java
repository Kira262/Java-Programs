import java.util.Scanner;

class LargestOddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of size N
        int[] numbers = new int[size];

        // Prompt the user to enter data for each element
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Variables to store largest odd and largest even numbers
        int largestOdd = Integer.MIN_VALUE; // Initialize largestOdd to the smallest possible integer value
        int largestEven = Integer.MIN_VALUE; // Initialize largestEven to the smallest possible integer value

        // Loop through the array to find largest odd and largest even numbers
        for (int number : numbers) {
            if (number % 2 != 0 && number > largestOdd) { // Check if the number is odd and larger than largestOdd
                largestOdd = number;
            } else if (number % 2 == 0 && number > largestEven) { // Check if the number is even and larger than
                                                                  // largestEven
                largestEven = number;
            }
        }

        // Display the largest odd number and the largest even number
        if (largestOdd != Integer.MIN_VALUE) {
            System.out.println("Largest odd number: " + largestOdd);
        } else {
            System.out.println("No odd numbers were entered.");
        }

        if (largestEven != Integer.MIN_VALUE) {
            System.out.println("Largest even number: " + largestEven);
        } else {
            System.out.println("No even numbers were entered.");
        }

        // Close the scanner
        scanner.close();
    }
}
