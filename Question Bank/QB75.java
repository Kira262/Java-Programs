
public class QB75 {
    public static void main(String[] args) {
        int a = 5, b = 1, temp;
        System.out.println("A:" + a + "B:" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping\nA:" + a + "B:" + b);
    }
}
