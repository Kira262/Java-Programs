public class Qb117 {
    String fn, ln;
    int age;

    public Qb117() {
        this.fn = "John";
        this.ln = "Doe";
        this.age = 18;
        display();
    }

    public void display() {
        System.out.println("First Name: " + fn);
        System.out.println("Last Name: " + ln);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Qb117 student = new Qb117();
    }
}
