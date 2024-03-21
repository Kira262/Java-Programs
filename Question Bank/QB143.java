import java.util.Scanner;

public class QB143 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String n = s.nextLine();

        System.out.print("Enter the number of units consumed: ");
        int unit_got = s.nextInt();

        // Calculate total cost
        double tc = calculateBill(unit_got);

        // Check if surcharge is applicable
        if (tc > 400) {
            tc += tc * 0.15; // Add 15% surcharge
        }

        System.out.println("Name: " + n);
        System.out.println("Total amount to be paid: Rs. " + tc);
    }

    public static double calculateBill(int unit_got) {
        double bill = 0;

        // First 50 units are free
        if (unit_got <= 50) {
            return 100; // Meter charge
        }

        // Calculate bill for the next 150 units (51 - 200)
        if (unit_got > 50 && unit_got <= 200) {
            bill += (unit_got - 50) * 0.80;
        } else {
            bill += 150 * 0.80;
        }

        // Calculate bill for the next 100 units (201 - 300)
        if (unit_got > 200 && unit_got <= 300) {
            bill += (unit_got - 200) * 0.90;
        } else {
            bill += 100 * 0.90;
        }

        // Calculate bill for units beyond 300
        if (unit_got > 300) {
            bill += (unit_got - 300) * 1.0;
        }

        // Add meter charge
        bill += 100;

        return bill;
    }
}
