abstract class lang{
    void display(){
        System.out.println("This is a display of lang");
    }
}
class  java extends lang {
    void show(){
        System.out.println("show method of java");
    }
}
class d11_7{
    public static void main(String[] args) {
        lang  l= new java();
        l.display();
        // ((java)l).show();
        //l.show();//error
    }
}
