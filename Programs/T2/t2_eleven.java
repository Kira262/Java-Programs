// Create 3 objects having instance variables x,y . Add  value of 1st and 2nd objects and store to 3rd objects using object passing method

public class t2_eleven {

    public static void main(String[] args) {

        PassObject P = new PassObject();
        P.set(2, 3);
        PassObject Q = new PassObject();
        Q.set(4, 5);
        PassObject r = new PassObject();
        r.add(P, Q);
        System.out.println(r.x);
        System.out.println(r.y);
    }
}

class PassObject {
    int x, y;

    void set(int n1, int n2) {
        x = n1;
        y = n2;
    }

    void add(PassObject a, PassObject b) {
        x = a.x + b.x;
        y = a.y + b.y;
    }
}
