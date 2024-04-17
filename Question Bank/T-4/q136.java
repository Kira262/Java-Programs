import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class SortNumbers {
    public static void main(String[] args) {
        String inputFile = "unsorted_numbers.txt";
        String outputFile = "sorted_numbers.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            ArrayList<Integer> numbers = new ArrayList<>();

            // Read numbers from the input file
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                numbers.add(number);
            }

            // Sort the numbers
            Collections.sort(numbers);

            // Write sorted numbers to the output file
            for (int number : numbers) {
                writer.write(Integer.toString(number));
                writer.newLine();
            }

            System.out.println("Numbers sorted and written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
