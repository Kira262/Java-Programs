class Argument1{
    void Add(int i)
    {
        System.out.println("Argumenet method");
    }
    void Add(int... i)
    {
        System.out.println("variable length array");
    }
}

class d7_3 {
    public static void main(String[] args) {
        Argument1 a = new Argument1();
        a.Add(2);
        a.Add(2,2);
        a.Add(2,2,2);
    }
}
