import java.io.*;

class WordCounter {
    public static void main(String[] args) {
        // Check if the correct number of arguments are provided
        if (args.length != 1) {
            System.err.println("Usage: java WordCounter <filename>");
            return;
        }

        String filename = args[0];

        try {
            // Open the file
            File file = new File(filename);
            if (!file.exists()) {
                System.err.println("Error: File " + filename + " does not exist.");
                return;
            }

            // Count words in the file
            int wordCount = 0;
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by whitespace characters
                wordCount += words.length;
            }
            reader.close();

            System.out.println("Number of words in the file: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
