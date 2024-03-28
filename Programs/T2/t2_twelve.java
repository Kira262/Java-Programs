// Array of an Object
// Create a class Student with roll no. ,name, age as data members. Use array of object method to initialize all objects and print data of all the objects. 
public class t2_twelve {
    public static void main(String[] args) {
        std[] obj = new std[3];// No memory allocated

        for (int i = 0; i < 3; i++) {
            obj[i] = new std();// Memory allocated NOW
        }
        obj[0].set(3, 22, "null");
        obj[1].set(5, 23, "kira");
        obj[2].set(6, 12, "auum");
        for (int i = 0; i < 3; i++) {
            obj[i].display();
        }
    }
}

class std {
    String name;
    int age, roll_no;

    void set(int rno, int ag, String nm) {
        roll_no = rno;
        age = ag;
        name = nm;
    }

    void display() {
        System.out.println("Name:" + name + "\tRoll No:" + roll_no + "\tAge:" + age + "\n");
    }
}