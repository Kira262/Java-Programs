// Constructorr
class Constructor {
    int x, y;

    Constructor(int a, int b) {
        x = a;
        y = b;
    }
}

class t2_fourteen {
    public static void main(String[] args) {
        Constructor obj = new Constructor(5, 8);
        System.out.println("X: " + obj.x + "\tY:" + obj.y);
    }
}
