
// WAP to delete the element at position which is given by the user.
import java.util.Scanner;

public class Delete {
    public static void main(String args[]) {
        int n, position;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements you want in array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter value of Position: ");
        position = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == position) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        System.out.println("After Deletion: ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
