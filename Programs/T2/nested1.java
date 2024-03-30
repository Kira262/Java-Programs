// Nested => Non-Static
class outer {
    int x = 10;

    class inner {
        int y = 5;
    }
}

class mai11 {
    public static void main(String[] args) {
        outer out = new outer();
        outer.inner in = out.new inner();
        System.out.println(in.y + out.x);
    }
}