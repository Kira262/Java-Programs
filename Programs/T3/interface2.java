//Object creation of Interface
interface vehicle{
    void ignite();
}
class twowheel implements vehicle{
    // Explicitily  give public
    public void ignite(){
        System.out.println("BURN ");
    }
}
class interface2{
    public static void main(String[] args) {
        vehicle v=new twowheel();
        v.ignite();
    }
}