class Car {
    String company;
    double cc;

    Car(Car x) {
        company = x.company;
        cc = x.cc;
    }

    Car() {

    }

    void def() {
        company = "VRemera";
        cc = 2400;
    }
}

class t2_fifteeen {
    public static void main(String[] args) {
        Car Polo = new Car();
        Polo.def();

        Car golf = new Car(Polo);
        System.out.println(Polo.company);
        System.out.println(Polo.cc);
        System.out.println(golf.company);
        System.out.println(golf.cc);
    }
}
