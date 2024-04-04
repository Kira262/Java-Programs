import java.util.Scanner;

class exc1 extends RuntimeException {
    exc1(String s) {
        super(s);
    }
}

class user_ex1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter :");
        int x = s.nextInt();
        try {
            if (x == 10) {
                throw new exc1("NO 10");
            }
        } catch (exc1 e) {
            System.out.println("Exception HAndled");
        }
        System.out.println("Hellooo");
        s.close();
    }
}