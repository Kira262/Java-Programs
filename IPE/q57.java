class ArrayAvg {
    public static void main(String[] args) {
        // Create and initialize a four-element integer array
        int[] numbers = { 5, 10, 15, 20 };

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Display the average
        System.out.println("Average of the values in the array: " + average);
    }
}
