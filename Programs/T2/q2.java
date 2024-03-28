// Calc area of rectangle,circle,triangle using constructor overloading

class Area {
    void area(double b, double h) {
        System.out.println("The area of the triangle is " + 0.5 * b * h + " sq units");
    }

    void area(float x, float y) {
        System.out.println("The area of the rectangle is " + x * y + " sq units");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is " + z + " sq units");
    }
}

class Main {
    public static void main(String args[]) {
        Area ob = new Area();
        ob.area(5, 2);
        ob.area(11, 12);
        ob.area(2.5);
    }
}
