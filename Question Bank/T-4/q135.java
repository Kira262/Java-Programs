import java.io.FileInputStream;
import java.io.IOException;

class ReverseBytes {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ReverseBytes <fileName>");
            return;
        }

        String fileName = args[0];

        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            long totalBytes = fis.available();

            while (totalBytes > 0) {
                int bytesToRead = (int) Math.min(buffer.length, totalBytes);
                fis.skip(totalBytes - bytesToRead);
                bytesRead = fis.read(buffer, 0, bytesToRead);
                if (bytesRead == -1) {
                    break;
                }
                for (int i = bytesRead - 1; i >= 0; i--) {
                    System.out.print(buffer[i]);
                }
                totalBytes -= bytesRead;
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
// Run
// javac ReverseBytes.java
// java ReverseBytes fileName
