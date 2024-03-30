// Nested => Static
class outercl{
    int x=10;
    static class inerclass{
        int y=5;
    }
}
class nesteme{
    public static void main(String[] args) {
        outercl.inerclass in =new outercl.inerclass();
        System.out.println(in.y);
    }
}