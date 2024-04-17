import java.io.*;

class FileCopy {
    public static void main(String[] args) {
        try {
            // Reading source file name and destination file name from user input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter source file name: ");
            String sourceFileName = reader.readLine();
            System.out.print("Enter destination file name: ");
            String destinationFileName = reader.readLine();

            // Creating InputStream for source file
            FileInputStream inputStream = new FileInputStream(sourceFileName);

            // Creating OutputStream for destination file
            FileOutputStream outputStream = new FileOutputStream(destinationFileName);

            // Copying content from source file to destination file
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            // Closing streams
            inputStream.close();
            outputStream.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
