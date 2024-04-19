import java.util.Scanner;

class MultipleInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        System.out.print("Enter the starting value of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending value of the range: ");
        int end = scanner.nextInt();

        System.out.println("Multiples of " + N + " within the range [" + start + ", " + end + "]:");
        for (int i = start; i <= end; i++) {
            if (i % N == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
