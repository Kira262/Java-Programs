class Argumenet{
    void m1(Object o)
    {
System.out.println("object version");
    }
    void m1(String s)
    {
        System.out.println("string class");
    }
}
class d7_2{
    public static void main(String[] args) {
        Argumenet a = new Argumenet();
        a.m1("ABC");
        a.m1(new Object());
        a.m1(null);

    }
}