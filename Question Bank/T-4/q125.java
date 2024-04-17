import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <sourceFile> <destinationFile>");
            return;
        }

        String sourceFileName = args[0];
        String destinationFileName = args[1];

        try (FileReader reader = new FileReader(sourceFileName);
                FileWriter writer = new FileWriter(destinationFileName)) {

            char[] buffer = new char[1024];
            int bytesRead;

            while ((bytesRead = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
// RUn
// javac FileCopy.java
// java FileCopy sourceFile.txt destinationFile.txt
