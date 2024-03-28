class t2_sixteen {
    public static void main(String[] args) {
        Stdent s1 = new Stdent(12, "karen");
        Stdent s2 = new Stdent(11, "lallu", 54);
        // Stdent s3 = new Stdent();
        s1.display();
        s2.display();
        // s3.display();
    }
}

class Stdent {
    int id, age;
    String name;

    Stdent(int i, String n) {
        id = i;
        name = n;
    }

    Stdent(int i, String n, int f) {
        id = i;
        name = n;
        age = f;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + age + "\t");
    }

}
