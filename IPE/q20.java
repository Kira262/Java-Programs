class SumDivisibleByFive {
    public static void main(String[] args) {
        int sum = 0;

        // Iterate through numbers from 101 to 199
        for (int i = 101; i < 200; i++) {
            if (i % 5 == 0) { // Check if the number is divisible by 5
                sum += i; // Add the number to the sum
            }
        }

        // Display the sum
        System.out.println("Sum of integers greater than 100 and less than 200 that are divisible by 5: " + sum);
    }
}
