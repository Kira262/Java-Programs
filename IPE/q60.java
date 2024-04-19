class TotalAndAverage {
    private int[] values;
    private int total;
    private double average;

    // Constructor to initialize the values array and calculate total and average
    public TotalAndAverage(int[] values) {
        this.values = values;
        calculateTotal();
        calculateAverage();
    }

    // Method to calculate the total of the values
    private void calculateTotal() {
        for (int value : values) {
            total += value;
        }
    }

    // Method to calculate the average of the values
    private void calculateAverage() {
        average = (double) total / values.length;
    }

    // Getter method for total
    public int getTotal() {
        return total;
    }

    // Getter method for average
    public double getAverage() {
        return average;
    }

    public static void main(String[] args) {
        int[] inputValues = { 5, 10, 15, 20, 25 };
        TotalAndAverage calculator = new TotalAndAverage(inputValues);
        System.out.println("Total of the values: " + calculator.getTotal());
        System.out.println("Average of the values: " + calculator.getAverage());
    }
}
