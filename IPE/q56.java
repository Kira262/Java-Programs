class NegativeNumberCount {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Please provide exactly five numbers as command-line arguments.");
            return;
        }

        // Array to store the numbers
        int[] numbers = new int[5];

        // Convert command-line arguments to integers and store them in the array
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + args[i] + " is not a valid integer.");
                return;
            }
        }

        // Count the number of negative numbers
        int negativeCount = countNegativeNumbers(numbers);

        // Display the count of negative numbers
        System.out.println("Count of negative numbers: " + negativeCount);
    }

    // Function to count negative numbers in an array
    public static int countNegativeNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }
}
// javac NegativeNumberCount.java
// java NegativeNumberCount 5 -3 10 -7 8
