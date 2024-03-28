// Passing object as a Parameter

import java.util.Scanner;

class t2_ten {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = s.next();

        System.out.print("Enter AGe:");
        int age = s.nextInt();

        Students std = new Students();
        std.set(name, age);

        Students std1 = new Students();
        System.out.println("Original Object");
        std.display();

        std.CopyObject(std1);

        System.out.println("Copied Object");
        std1.display();

    }
}

class Students {
    String name;
    int age;

    void set(String x, int y) {
        name = x;
        age = y;
    }

    Students CopyObject(Students std) {
        std.name = name;
        std.age = age;
        return std;
    }

    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}   
