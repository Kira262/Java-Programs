
class Parents {
    Parents() {
        System.out.println("Parents Class Construcotor");
    }
}

class SubCles extends Parents {
    SubCles() {
        System.out.println("CHild Class Construcotor");
    }

    SubCles(int num) {

        System.out.println("CHild Class Construcotor 2");
    }

    void display() {
        System.out.println("Default");
    }

}

class mainee {
    public static void main(String[] args) {
        SubCles ob = new SubCles();
        ob.display();
        SubCles ob2 = new SubCles();
        ob2.display();
    }
}