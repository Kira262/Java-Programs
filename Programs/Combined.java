// WAP to combined two array a and b and store to array c.
public class Combined {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 6, 7, 8, 9, 10 };
        int size = a.length + b.length;
        int c[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.println(c[i]);
        }
    }
}
