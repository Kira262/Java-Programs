import java.io.*;

class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

class StudentManager {
    public static void main(String[] args) {
        String fileName = "students.txt";

        // Write student information to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("101,John,3.8\n");
            writer.write("102,Alice,3.9\n");
            writer.write("103,Bob,3.7\n");
            System.out.println("Student information has been written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read student information from file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double gpa = Double.parseDouble(parts[2]);
                Student student = new Student(id, name, gpa);
                System.out.println(
                        "ID: " + student.getId() + ", Name: " + student.getName() + ", GPA: " + student.getGpa());
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}
