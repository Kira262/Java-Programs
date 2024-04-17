import java.util.ArrayList;
import java.util.Collections;

class MergeAndSortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 1; i <= 10; i += 2) {
            oddNumbers.add(i);
        }

        for (int i = 2; i <= 10; i += 2) {
            evenNumbers.add(i);
        }

        ArrayList<Integer> mergedList = new ArrayList<>(oddNumbers);
        mergedList.addAll(evenNumbers);

        Collections.sort(mergedList, Collections.reverseOrder());

        System.out.println("Sorted List in Descending Order:");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }
}
