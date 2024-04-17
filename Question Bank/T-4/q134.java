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
        int alphabetCount = 0;
        int digitCount = 0;
        int spaceCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
                for (char c : line.toCharArray()) {
                    if (Character.isLetter(c)) {
                        alphabetCount++;
                    } else if (Character.isDigit(c)) {
                        digitCount++;
                    } else if (Character.isWhitespace(c)) {
                        spaceCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            return;
        }

        System.out.println("Character count: " + charCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);
        System.out.println("Alphabet count: " + alphabetCount);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Whitespace count: " + spaceCount);
    }
}
