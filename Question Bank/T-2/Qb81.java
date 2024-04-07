import java.util.Arrays;

public class Qb81 {

    public static void main(String[] args) {
        int[] sourceArray = { 1, 2, 3, 4, 5 };
        int[] targetArray = new int[sourceArray.length]; // Create a target array

        copyArray(sourceArray, targetArray); // Copy elements

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array: " + Arrays.toString(targetArray));
    }

    public static void copyArray(int[] source, int[] target) {
        // Check if the arrays have the same length
        if (source.length != target.length) {
            System.out.println("Arrays must have the same length for copying.");
            return;
        }

        // Copy elements from source array to target array
        for (int i = 0; i < source.length; i++) {
            target[i] = source[i];
        }
    }
}
