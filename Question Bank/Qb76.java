public class Qb76 {

    public static void addFiveToElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5; // Modify each element by adding 5
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 }; // Original array
        addFiveToElements(numbers);
        System.out.println("Modified elements of the array:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

}
