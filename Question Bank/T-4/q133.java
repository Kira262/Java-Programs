import java.io.*;

class ReplaceWords {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceWords <fileName> <wordToReplace> <replacement>");
            return;
        }

        String fileName = args[0];
        String wordToReplace = args[1];
        String replacement = args[2];
        int replacementCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(wordToReplace, replacement);
                writer.write(line);
                writer.newLine();
                replacementCount += countOccurrences(line, replacement);
            }

            System.out.println("Number of replacements: " + replacementCount);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Helper method to count occurrences of a substring in a string
    private static int countOccurrences(String line, String word) {
        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = line.indexOf(word, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += word.length();
            }
        }

        return count;
    }
}
