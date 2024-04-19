class ArraySortingCheck {
    public static void main(String[] args) {
        // Create an integer array
        int[] arr = { 5, 10, 15, 20, 25 };

        // Check if the array is sorted
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        // Print the result
        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
