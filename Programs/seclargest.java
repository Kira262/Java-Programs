// WAP to find 2nd largest element of given array.
public class seclargest {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int largest, slargest;
        slargest=a[0];
        largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                slargest = largest;
                largest = a[i];
            }
        }
        System.out.println("Largest Number is: " + largest);
        System.out.println("Second Largest Number is: " + slargest);
    }
}
