import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadStudentFile {
    public static void main(String[] args) {
        String fileName = "student.txt";
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
