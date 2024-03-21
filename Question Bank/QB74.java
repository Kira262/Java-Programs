import java.util.Scanner;

public class QB74 {
    public static void main(String[] args) {
        double cel, far;
        Scanner s = new Scanner(System.in);
        System.out.println("ENter in CElcuis:");
        cel = s.nextDouble();
        far = (9 / 5) * cel + 32;
        System.out.println("to Farenheit:" + far);

    }
}
