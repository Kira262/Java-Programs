abstract class shape2 {
    abstract void display();

    abstract void area(int a);

    void show() {
        System.out.println("Show method called");
    }
    shape2(int x){
        System.out.println("constructor");
    }
    static void print(){
        System.out.println("hello static");
    }
}
class rec2 extends shape2{
    void display(){
        System.out.println("rec");
    }
    void area(int a){
        System.out.println("rec area");
    }
    rec2(){
        super(10);
    }
}


class d11_9 {
    public static void main(String[] args) {
        shape2 s = new rec2();
        s.display();
        s.area(10);
        s.show();
        shape2.print();

        
    }

}
