import java.io.*;

class IncomeTaxCalculator {
    public static void main(String[] args) {
        try {
            // Create a FileWriter to write to the tax.txt file
            FileWriter fileWriter = new FileWriter("tax.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Read and process salary for five employees
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 1; i <= 5; i++) {
                System.out.print("Enter salary of employee " + i + ": ");
                double salary = Double.parseDouble(reader.readLine());

                // Calculate income tax (10% of salary)
                double tax = salary * 0.10;

                // Write tax information to the file
                bufferedWriter.write("Employee " + i + " - Salary: $" + salary + " - Tax: $" + tax);
                bufferedWriter.newLine();
            }

            // Close the file writer
            bufferedWriter.close();

            System.out.println("Income tax calculated and stored in tax.txt successfully.");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
