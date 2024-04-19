class PentagonalNumbers {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;

        // Display the first 100 pentagonal numbers
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%-6d", getPentagonalNumber(i));
            if (i % NUMBERS_PER_LINE == 0) {
                System.out.println(); // Move to the next line after printing 10 numbers
            }
        }
    }

    // Method to calculate the pentagonal number for a given value of n
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }
}
