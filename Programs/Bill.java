// For find 50 unit Rs 0.50/unit
// For next 100 unit Rs 0.75/unit
// For next 100 unit Rs 1.20/unit
// For unit above 250 Rs 1.50/unit
// take unit i/p from user

import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        int unit;
        double bill;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Unit:");
        unit = sc.nextInt();

        if (unit <= 50) {
            bill = (unit * 0.50);
            System.out.println(bill);
        } else if (unit > 50 && unit <= 150) {
            bill = (unit - 50) * 0.75 + (50 * 0.5);
            System.out.println(bill);
        } else if (unit > 150 && unit <= 250) {
            bill = (unit - 150) * 1.20 + (100 * 0.75) + (50 * 0.50);
            System.out.println(bill);
        } else {
            bill = (unit - 250) * 1.5 + (150 * 1.2) + (100 * 0.75) + (50 * 0.50);
            System.out.println(bill);
        }
    }
}