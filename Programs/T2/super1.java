class SuperClass{
    int num=100;
}
class Subclass extends SuperClass{
    int num=101;
    void printnum(){
        System.out.println(num);
    }
}
class maine{
    public static void main(String[] args) {
        Subclass ob=new Subclass();
        ob.printnum();
    }
}