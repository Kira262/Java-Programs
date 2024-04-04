class exception1 {
    public static void main(String[] args) {
        System.out.println("Before");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("10 / 0 not possible");
        }
        System.out.println("After");
    }
}