import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

class Dictionary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hashtable<String, String> dictionary = new Hashtable<>();

        // Populate the dictionary with some initial words and their definitions
        dictionary.put("apple", "a fruit with a round green, yellow, or red skin and a whitish inside");
        dictionary.put("banana",
                "a long curved fruit which grows in clusters and has soft pulpy flesh and yellow skin when ripe");
        dictionary.put("cat",
                "a small domesticated carnivorous mammal with soft fur, a short snout, and retractile claws");

        // Prompt the user for a word and output its definition
        while (true) {
            System.out.print("Enter a word to look up (or 'quit' to exit): ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("quit")) {
                break;
            }

            if (dictionary.containsKey(word)) {
                System.out.println("Definition of '" + word + "': " + dictionary.get(word));
            } else {
                System.out.println("Word '" + word + "' not found in the dictionary.");

                // Ask the user if they want to add the word and its definition to the
                // dictionary
                System.out.print("Would you like to add '" + word + "' to the dictionary? (yes/no): ");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("yes")) {
                    System.out.print("Enter the definition of '" + word + "': ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Word '" + word + "' and its definition added to the dictionary.");
                }
            }
        }

        // Print out all words in the dictionary
        System.out.println("\nWords in the dictionary:");
        Set<String> words = dictionary.keySet();
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
