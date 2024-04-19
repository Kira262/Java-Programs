import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class IncomeTaxCalculator {
    public static void main(String[] args) {
        try {
            // Create a BufferedWriter to write to the tax file
            BufferedWriter writer = new BufferedWriter(new FileWriter("tax.txt"));

            Scanner scanner = new Scanner(System.in);

            // Read and process data for five employees
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter salary for Employee " + i + ":");
                double salary = scanner.nextDouble();
                double tax = calculateTax(salary);

                // Write the tax amount to the tax file
                writer.write("Employee " + i + ": Income Tax = " + tax);
                writer.newLine();
            }

            // Close the writer and scanner
            writer.close();
            scanner.close();

            System.out.println("Income tax calculated and stored in tax.txt file.");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to calculate income tax (10% of income)
    public static double calculateTax(double income) {
        return income * 0.1;
    }
}
