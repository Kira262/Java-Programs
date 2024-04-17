import java.io.*;

class NumberFileSorter {
    public static void main(String[] args) {
        // Define the file names
        String inputFileName = "input.txt";
        String evenFileName = "even.txt";
        String oddFileName = "odd.txt";

        try {
            // Create a new file and write numbers into it
            FileWriter writer = new FileWriter(inputFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            // Writing numbers into the file
            bufferedWriter.write("5\n10\n7\n4\n3\n8\n");
            bufferedWriter.close();

            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));

            // Open output files for even and odd numbers
            BufferedWriter evenFileWriter = new BufferedWriter(new FileWriter(evenFileName));
            BufferedWriter oddFileWriter = new BufferedWriter(new FileWriter(oddFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                if (number % 2 == 0) {
                    evenFileWriter.write(line);
                    evenFileWriter.newLine();
                } else {
                    oddFileWriter.write(line);
                    oddFileWriter.newLine();
                }
            }

            // Close all files
            reader.close();
            evenFileWriter.close();
            oddFileWriter.close();

            System.out.println("Numbers sorted and saved into even.txt and odd.txt successfully.");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
