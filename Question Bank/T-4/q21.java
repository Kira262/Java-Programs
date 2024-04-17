import java.util.ArrayList;
import java.util.Collections;

class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(5);
        arrayList1.add(2);
        arrayList1.add(8);
        arrayList1.add(1);

        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList1);

        Collections.sort(arrayList2);

        int searchElement = 8;
        int index = arrayList2.indexOf(searchElement);
        if (index != -1) {
            System.out.println(searchElement + " found at index " + index + " in the second ArrayList.");
        } else {
            System.out.println(searchElement + " not found in the second ArrayList.");
        }
    }
}
