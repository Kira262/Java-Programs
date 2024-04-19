import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileContentRead {
    public static void main(String[] args) {
        // Check if the user provided the file name as command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java FileContentReader <file_name>");
            return;
        }

        // Read the file name from command-line argument
        String fileName = args[0];

        try {
            // Create a BufferedReader to read from the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            // Read and display each line of the file until the end of file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();
        } catch (IOException e) {
            // Print an error message if there was an error reading the file
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
