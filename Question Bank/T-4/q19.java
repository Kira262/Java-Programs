import java.util.ArrayList;
import java.util.HashSet;

class ArrayListUtils {
    static ArrayList<String> removeDuplicates(ArrayList<String> inputList) {
        HashSet<String> set = new HashSet<>(inputList);

        ArrayList<String> resultList = new ArrayList<>(set);

        return resultList;
    }

    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("orange");
        inputList.add("apple");
        inputList.add("banana");

        ArrayList<String> result = removeDuplicates(inputList);

        System.out.println("ArrayList with duplicates: " + inputList);
        System.out.println("ArrayList with duplicates removed: " + result);
    }
}
