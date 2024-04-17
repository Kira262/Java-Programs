import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class CountDigitFive {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CountDigitFive <fileName>");
            return;
        }

        String fileName = args[0];
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int c;
            while ((c = reader.read()) != -1) {
                if (c == '5') {
                    count++;
                }
            }
            System.out.println("Number of occurrences of digit 5: " + count);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
