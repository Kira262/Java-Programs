class Fibonacci {
    // Function to generate Fibonacci series using recursion
    public static void generateFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int count = 10; // Change this value to generate Fibonacci series of different lengths
        System.out.println("Fibonacci series of first " + count + " numbers:");
        generateFibonacci(count);
    }
}
