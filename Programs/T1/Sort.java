// WAP to sort the array in ascending order.
import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int a[] = { 24, 345, 654, 6546, 546, 4564 };
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.err.println(a[i]);
        }
    }
}

