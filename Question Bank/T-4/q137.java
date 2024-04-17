import java.io.*;

class EvenOddSplitter {
    public static void main(String[] args) {
        String inputFileName = "numbers.txt";
        String evenFileName = "even.txt";
        String oddFileName = "odd.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
                BufferedWriter evenWriter = new BufferedWriter(new FileWriter(evenFileName));
                BufferedWriter oddWriter = new BufferedWriter(new FileWriter(oddFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number % 2 == 0) {
                    evenWriter.write(line);
                    evenWriter.newLine();
                } else {
                    oddWriter.write(line);
                    oddWriter.newLine();
                }
            }
            System.out.println("Numbers split into even and odd files successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
