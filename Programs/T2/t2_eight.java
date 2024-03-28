public class t2_eight {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        Array obj = new Array();
        obj.display(a);
        System.out.println(a[0]);
    }
}

class Array {
    void display(int[] a) {
        System.out.println(a[0]);
        a[0] = 100;
    }
}
