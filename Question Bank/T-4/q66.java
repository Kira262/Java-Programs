import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class UniqueSumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Set<Integer> uniqueIntegers = new HashSet<>();

        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            uniqueIntegers.add(num);
        }

        int sum = 0;
        for (int num : uniqueIntegers) {
            sum += num;
        }

        System.out.println("Sum of unique integers: " + sum);

        scanner.close();
    }
}
