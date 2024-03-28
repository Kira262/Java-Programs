// WAP to insert the element at position which is given by the user.
import java.util.Scanner;

public class Insert {
    public static void main(String args[]) {
        int n, element, position;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want in array: ");
        n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of Position: ");
        position = sc.nextInt();
        System.out.println("Enter value of Element: ");
        element = sc.nextInt();
        for (int i = n - 1; i >= position - 1; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position - 1] = element;
        System.out.println("After Inserting: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[n]);
    }
}
