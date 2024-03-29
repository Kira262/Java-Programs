// INheritance
// WAP create a class name member having following variables: name,age,phone number,address,salary.It also has a method name printsal which prints salary of the members.2 classes emp and manger inherits the member class.The emp and manger classes have data members speciailization and department respectively.Now assign name,age,phone,number,address and salary to an emp and manger by making an object of both of this classes  and print the same.
class member {
    String name, address;
    int age, phone, salary;

    member(String name, int age, int phone, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    void print_salary() {
        System.out.println("Salary: " + salary);
    }
}

class emp extends member {
    String specialisation;

    emp(String name, int age, int phone, String address, int salary, String specialisation) {
        super(name, age, phone, address, salary);
        this.specialisation = specialisation;
    }
}

class manger extends member {
    String department,specialisation;

    manger(String name, int age, int phone, String address, int salary, String specialisation, String department) {
        super(name, age, phone, address, salary);
        this.department = department;
        this.specialisation = specialisation;
    }
}

class question3 {
    public static void main(String[] args) {

        emp e = new emp("Ok", 20, 14343, "wibwivbiueb", 34, "nothing");

        System.out.println("Name: " + e.name);
        System.out.println("age: " + e.age);
        System.out.println("phone: " + e.phone);
        System.out.println("address: " + e.address);
        System.out.println("specialisation: " + e.specialisation);
        System.out.print("Salary: ");
        e.print_salary();
        System.out.print("\n");

        manger m = new manger("No", 324, 34235, "zzzzzzz", 23432, "qwertyui", "evev");

        System.out.println("Name: " + m.name);
        System.out.println("age: " + m.age);
        System.out.println("phone: " + m.phone);
        System.out.println("address: " + m.address);
        System.out.println("Department: " + m.department);
        System.out.println("Specialisation: " + m.specialisation);
        System.out.print("Salary: ");
        m.print_salary();
        System.out.print("\n");
    }
}