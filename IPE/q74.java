import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CopyFile {
    public static void main(String[] args) {
        // Check if correct number of command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <input_file> <output_file>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try {
            // Create a FileReader to read from the input file
            FileReader reader = new FileReader(inputFile);

            // Create a FileWriter to write to the output file
            FileWriter writer = new FileWriter(outputFile);

            // Create a character array to store the content of the input file
            char[] buffer = new char[1024];
            int charsRead;

            // Read from the input file into the buffer and write to the output file
            while ((charsRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, charsRead);
            }

            // Close the reader and writer
            reader.close();
            writer.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }
}
