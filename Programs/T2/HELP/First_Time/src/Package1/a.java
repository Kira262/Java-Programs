package Package1;

// Private keyword only works on the class it was given
// Protected keyword only works on the same file and same file in the SAME FOLDER
public class a {
    protected int x = 10;

    protected void show() {
        System.out.println("This is show method class A");
    }
}

class b {
    public static void main(String[] args) {
        a obj = new a();
        obj.show();
    }
}