import java.io.FileNotFoundException;

class A {
    void divide() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}

class exception5 {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.divide();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}