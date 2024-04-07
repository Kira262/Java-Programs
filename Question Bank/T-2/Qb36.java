class PermutationCalculator {
    // Method to calculate factorial of a number
    long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate nPr (permutation)
    long calcPermutation(int n, int r) {
        return factorial(n) / factorial(n - r);
    }
}

public class Qb36 {
    public static void main(String[] args) {
        int n = 10; // Value of n
        int r = 3; // Value of r

        PermutationCalculator permCHecker = new PermutationCalculator();
        long nPr = permCHecker.calcPermutation(n, r);

        System.out.println("nPr for n=" + n + " and r=" + r + " is: " + nPr);
    }
}
