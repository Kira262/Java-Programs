// Create array of 10 elements and take all elements from user. Modify 1st and 2nd elements of the array with 10 and 20, and print array . Use passing the array method

import java.util.Scanner;

class t2_nine {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("ENter an Array:;");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        Arr obj = new Arr();
        obj.display(a);
    }
}

class Arr {
    void display(int[] x) {
        x[0] = 10;
        x[1] = 20;
        System.out.println("Modified Array:;");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}
