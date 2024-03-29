class parclass {
    parclass() {
        System.out.println("no-argument Parent constructor");
    }

    parclass(String i) {

        System.out.println("Parent constructor with parameter");
    }
}

class SubCle extends parclass {
    SubCle() {
        super("Help");
        System.out.println("Help");
    }

    void display() {
        System.out.println("Display");

    }
}
class min1{
    public static void main(String[] args) {
        SubCle ob=new SubCle();
        ob.display();
    }
}