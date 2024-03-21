import java.util.Scanner;

public class QB73 {
    public static void main(String[] args) {
        System.out.println("please enter number of days :");
        Scanner s = new Scanner(System.in);
        int days = s.nextInt();
        int months = (days % 365) / 30;
        int dayys = (days % 365) % 30;
        System.out.format("months =%s, days =%s", months, dayys);
    }
}