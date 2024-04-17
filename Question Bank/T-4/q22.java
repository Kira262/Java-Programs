import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}

class EmployeeManagementSystem {
    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Update Employee Details");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    removeEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    displayEmployees();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addEmployee() {
        System.out.println("\nAdding Employee");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        Employee newEmployee = new Employee(name, age, salary);
        employeeList.add(newEmployee);
        System.out.println("Employee added successfully!");
    }

    private static void removeEmployee() {
        System.out.println("\nRemoving Employee");
        if (employeeList.isEmpty()) {
            System.out.println("No employees to remove!");
            return;
        }

        System.out.print("Enter the name of the employee to remove: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Employee emp : employeeList) {
            if (emp.getName().equalsIgnoreCase(name)) {
                employeeList.remove(emp);
                found = true;
                System.out.println("Employee removed successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found!");
        }
    }

    private static void updateEmployee() {
        System.out.println("\nUpdating Employee Details");
        if (employeeList.isEmpty()) {
            System.out.println("No employees to update!");
            return;
        }

        System.out.print("Enter the name of the employee to update: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Employee emp : employeeList) {
            if (emp.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new age: ");
                int newAge = scanner.nextInt();
                System.out.print("Enter new salary: ");
                double newSalary = scanner.nextDouble();

                emp.setName(newName);
                emp.setAge(newAge);
                emp.setSalary(newSalary);

                found = true;
                System.out.println("Employee details updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found!");
        }
    }

    private static void displayEmployees() {
        System.out.println("\nEmployee List:");
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display!");
            return;
        }

        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
