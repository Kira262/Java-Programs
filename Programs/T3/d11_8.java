abstract class shape {
    abstract void display();

    abstract void area(int a);

    void show() {
        System.out.println("Show method called");
    }
}
class rec extends shape{
    void display(){
        System.out.println("rec");
    }
    void area(int a){
        System.out.println("rec area");
    }
}

class circle extends shape{
    void display(){
        System.out.println("circle");
    }
    void area(int a){
        System.out.println("circle area");
    }
}

class d11_8 {
    public static void main(String[] args) {
        shape s = new rec();
        s.display();
        s.area(10);
        s.show();

        shape s1=new circle();
        s1.display();
        s1.area(50);
        s1.show();
    }

}
