public class Qb118 {
    double ca, ra;

    public Qb118(double radius) {
        this.ca = Math.PI * radius * radius;
    }

    public Qb118(double length, double width) {
        this.ra = length * width;
    }

    public double gca() {
        return ca;
    }

    public double gra() {
        return ra;
    }

    public static void main(String[] args) {

        double cr = 5.0;
        Qb118 circleQb118 = new Qb118(cr);
        double ca = circleQb118.gca();

        double rl = 4.0;
        double rw = 6.0;
        Qb118 rectangleQb118 = new Qb118(rl, rw);
        double ra = rectangleQb118.gra();

        System.out.println("Area of Circle with radius " + cr + " is: " + ca);
        System.out.println("Area of Rectangle with length " + rl + " and width " + rw + " is: "
                + ra);
    }
}
