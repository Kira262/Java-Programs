class Combination {
    // Function to calculate factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Function to calculate nCr using recursion
    public static int nCr(int n, int r) {
        int numerator = factorial(n);
        int denominator = factorial(r) * factorial(n - r);
        return numerator / denominator;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int result = nCr(n, r);
        System.out.println("Combination of " + n + " choose " + r + " is: " + result);
    }
}
