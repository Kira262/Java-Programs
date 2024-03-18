// WAP to find if the number is Armstrong Number or not. Example: - 153 is an Armstrong Number.
public class QB198 {
    public static void main(String[] args) {
        int n = 153;
        int r, temp;
        int sum = 0;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("This is A ARMSTRONG NUMBER!!");
        } else {
            System.out.println("This is Not A ARMSTRONG NUMBER!!");
        }
    }
}