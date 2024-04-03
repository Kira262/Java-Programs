//Object creation of Interface
interface vehiclee{
    void ignite();
}
class twowheell implements vehiclee{
    // Explicitily  give public
    public void ignite(){
        System.out.println("BURN ");
    }
}
class interface2{
    public static void main(String[] args) {
        vehiclee v=new twowheell();
        v.ignite();
    }
}