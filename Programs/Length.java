// WAP to find number of digit of given number.
public class Length {
    public static void main(String[] args) {
        int n, i;
        i = 0;
        n = 35729;
        while (n>0) {
            n=n/10;
            i++;
        }
        System.out.println("Number Of Digit Of Given Number: "+i);
    }
}