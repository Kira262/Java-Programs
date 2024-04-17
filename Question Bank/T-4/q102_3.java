import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReaderConsoleOutput {
    public static void main(String[] args) {
        // Check if the correct number of arguments are provided
        if (args.length != 1) {
            System.err.println("Usage: java FileReaderConsoleOutput <filename>");
            return;
        }

        String filename = args[0];

        try {
            // Open the file
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            // Read and display each line of the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the file reader
            reader.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
