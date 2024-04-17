import java.io.*;

class NumberFileSorter {
    public static void main(String[] args) {
        try {
            // Open input file
            BufferedReader inputFileReader = new BufferedReader(new FileReader("numbers.txt"));

            // Open output files for even and odd numbers
            BufferedWriter evenFileWriter = new BufferedWriter(new FileWriter("even.txt"));
            BufferedWriter oddFileWriter = new BufferedWriter(new FileWriter("odd.txt"));

            String line;
            while ((line = inputFileReader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());

                if (number % 2 == 0) {
                    evenFileWriter.write(String.valueOf(number));
                    evenFileWriter.newLine();
                } else {
                    oddFileWriter.write(String.valueOf(number));
                    oddFileWriter.newLine();
                }
            }

            // Close all files
            inputFileReader.close();
            evenFileWriter.close();
            oddFileWriter.close();

            System.out.println("Numbers sorted and saved successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
