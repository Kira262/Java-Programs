import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileSearch {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileSearch <fileName>");
            return;
        }

        String fileName = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
