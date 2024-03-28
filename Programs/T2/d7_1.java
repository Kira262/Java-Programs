class Test{
    void name(String s)
    {
        System.out.println("string class");
    }

    void name(StringBuffer s)
    {
        System.out.println("stringBuffer class");
    }
}
class d7_1 {
public static void main(String[] args) {
    Test t=new Test();
    System.out.println(t);//address
    t.name("LJU");
    t.name(new StringBuffer("ABC"));
    //t.name(null);
}

}