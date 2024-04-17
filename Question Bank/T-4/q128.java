import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileStats {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileStats <fileName>");
            return;
        }

        String fileName = args[0];
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
    }
}
