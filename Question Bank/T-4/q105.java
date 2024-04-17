import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class NumberSumCalculator {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "Number.txt";

        try {
            // Open the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            // Read and sum all the numbers
            int sum = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                // Parse each line as an integer and add it to the sum
                sum += Integer.parseInt(line.trim());
            }

            // Close the file reader
            reader.close();

            // Print the sum
            System.out.println("Sum of all numbers in " + fileName + ": " + sum);
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
