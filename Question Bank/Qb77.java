import java.util.Scanner;

public class Qb77 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int originalValue = scanner.nextInt();

        modifyValue(originalValue);

        System.out.println("Original value after modification: " + originalValue);

        scanner.close();
    }

    public static void modifyValue(int value) {
        // Modify the value
        value += 10;
        System.out.println("Value inside method after modification: " + value);
    }
}
