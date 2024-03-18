// WAP to add all the digits of the given number.
public class SumDigits {
    public static void main(String[] args) {
        int n, i, var, sum;
        i = 0;
        sum = 0;
        n = 35729;
        while (n > 0) {
            var = n % 10;
            sum = sum + var;
            n = n / 10;
        }
        System.out.println("Sum Of All Digits Of Given Number: " + sum);
    }
}