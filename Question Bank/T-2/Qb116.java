public class Qb116 {
    int id;
    int[] mark = new int[6];
    double spi;

    public Qb116(int id, int[] mark) {
        this.id = id;
        this.mark = mark;
        this.spi = 0.0;
    }

    public void calculateSPI() {
        int tm = 0;
        int tc = 6 * 5;
        for (int marks : mark) {
            tm += marks;
        }
        this.spi = (tm / 6.0) / 10.0;
    }

    public void display() {
        System.out.println("Qb116 ID: " + id);
        System.out.println("Marks Obtained:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Subject " + (i + 1) + ": " + mark[i]);
        }
        System.out.println("SPI: " + spi);
    }

    public static void main(String[] args) {

        int n = 3;
        int[][] studentData = {
                { 101, 85, 90, 75, 80, 95, 85 },
                { 102, 70, 80, 65, 75, 85, 0 },
                { 103, 90, 95, 85, 80, 85, 0 }
        };

        Qb116[] students = new Qb116[n];
        for (int i = 0; i < n; i++) {
            int id = studentData[i][0];
            int[] marks = new int[6];
            System.arraycopy(studentData[i], 1, marks, 0, 6);
            Qb116 student = new Qb116(id, marks);
            student.calculateSPI();
            students[i] = student;
        }

        System.out.println("Qb116 Details:");
        for (Qb116 student : students) {
            student.display();
            System.out.println();
        }
    }
}
