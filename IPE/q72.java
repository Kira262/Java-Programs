import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class WordReplacement {
    public static void main(String[] args) {
        // Check if correct number of command-line arguments are provided
        if (args.length != 4) {
            System.out.println("Usage: java WordReplacement <input_file> <output_file> <word1> <word2>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];
        String word1 = args[2];
        String word2 = args[3];

        try {
            // Create a BufferedReader to read from input file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Create a BufferedWriter to write to output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            int replacementCount = 0;

            // Read each line from input file
            while ((line = reader.readLine()) != null) {
                // Replace all occurrences of word1 with word2 in the line
                String modifiedLine = line.replaceAll(word1, word2);

                // Write the modified line to output file
                writer.write(modifiedLine);
                writer.newLine();

                // Count replacements
                replacementCount += countOccurrences(line, word1);
            }

            // Close the reader and writer
            reader.close();
            writer.close();

            // Display the number of replacements
            System.out.println("Number of replacements: " + replacementCount);

        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        }
    }

    // Method to count occurrences of a substring in a string
    public static int countOccurrences(String text, String word) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }
        return count;
    }
}
