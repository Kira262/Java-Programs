public class Qb67 {

    // Method to display elements of the array
    public static void displayArray(int[] arr) {
        System.out.println("Elements of the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 2, 9, 1, 3 };

        // Call method to display elements of the array
        displayArray(numbers);
    }
}
