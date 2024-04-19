class SumOfDigit {
    // Function to find the sum of digits using recursion
    public static int sumOfDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return (number % 10) + sumOfDigits(number / 10);
        }
    }

    public static void main(String[] args) {
        int number = 12345; // Change this number to find sum of digits for different numbers
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
