import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class WordCount {
    public static void main(String[] args) {
        // Check if correct number of command-line arguments are provided
        if (args.length != 1) {
            System.out.println("Usage: java WordCount <file_name>");
            return;
        }

        String fileName = args[0];

        // Check if the file exists
        Path filePath = Paths.get(fileName);
        if (!Files.exists(filePath) || !Files.isRegularFile(filePath)) {
            System.out.println("File does not exist or is not a regular file.");
            return;
        }

        try {
            // Create a BufferedReader to read from the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            int wordCount = 0;
            String line;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split the line into words based on white space characters
                String[] words = line.split("\\s+");

                // Update the word count
                wordCount += words.length;
            }

            // Close the reader
            reader.close();

            // Display the word count
            System.out.println("Number of words in the file: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
