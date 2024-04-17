import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class PrefixSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> wordSet = new HashSet<>();

        // Read words from the user
        System.out.print("Enter the number of words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            wordSet.add(word);
        }

        // Prompt the user for a prefix
        System.out.print("Enter a prefix to search for: ");
        String prefix = scanner.nextLine();

        // Output words that start with the given prefix
        System.out.println("Words with prefix '" + prefix + "':");
        for (String word : wordSet) {
            if (word.startsWith(prefix)) {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
