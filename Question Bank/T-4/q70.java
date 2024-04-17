import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Read words from a file and store their frequency in a map
        try {
            File file = new File("words.txt"); // Replace "words.txt" with the path to your file
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        // Prompt the user for a word and output its frequency
        System.out.print("Enter a word to search for: ");
        String wordToSearch = scanner.next();
        Integer frequency = wordFrequencyMap.get(wordToSearch);
        if (frequency != null) {
            System.out.println("Frequency of '" + wordToSearch + "': " + frequency);
        } else {
            System.out.println("The word '" + wordToSearch + "' is not in the map.");
        }

        scanner.close();
    }
}
