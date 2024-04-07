public class Qb115 {
    double r, img;

    public Qb115() {
        this.r = 0.0;
        this.img = 0.0;
    }

    public Qb115(double r) {
        this.r = r;
        this.img = 0.0;
    }

    public Qb115(double r, double img) {
        this.r = r;
        this.img = img;
    }

    public Qb115 add(Qb115 ot) {
        double newReal = this.r + ot.r;
        double newImaginary = this.img + ot.img;
        return new Qb115(newReal, newImaginary);
    }

    public double gr() {
        return r;
    }

    public double gim() {
        return img;
    }

    public String toString() {
        if (img >= 0) {
            return r + " + " + img + "i";
        } else {
            return r + " - " + Math.abs(img) + "i";
        }
    }

    public static void main(String[] args) {

        Qb115 c1 = new Qb115();
        Qb115 c2 = new Qb115(3.0);
        Qb115 c3 = new Qb115(2.0, 4.0);

        Qb115 sum = c2.add(c3);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("Sum of c2 and c3 = " + sum);
    }
}
