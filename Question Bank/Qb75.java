public class Qb75 {

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 }; // Example numbers
        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);
    }

    public static int calculateSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
