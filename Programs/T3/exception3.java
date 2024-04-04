class exception3 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divide by 10/0 Invalid");
        }
    }
}