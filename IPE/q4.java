import java.util.Scanner;

class DaysToMonthsAndDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        int months = days / 30;
        int remainingDays = days % 30;

        System.out.println(days + " days is equal to " + months + " months and " + remainingDays + " days.");

        scanner.close();
    }
}
