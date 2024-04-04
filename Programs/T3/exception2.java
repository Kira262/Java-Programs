// Methods to print exception information

class exception2 {
    public static void main(String[] args) {
        System.out.println("Default ");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}