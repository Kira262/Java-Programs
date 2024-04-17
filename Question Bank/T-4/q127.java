import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("emp.txt"))) {
            System.out.println("Enter employee details (ID, Name, Salary):");
            while (true) {
                System.out.print("Employee ID (or type 'exit' to quit): ");
                String id = scanner.nextLine();
                if (id.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Employee Name: ");
                String name = scanner.nextLine();

                System.out.print("Employee Salary: ");
                String salary = scanner.nextLine();

                writer.write(id + "," + name + "," + salary);
                writer.newLine();
            }
            System.out.println("Employee details stored successfully in emp.txt.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
