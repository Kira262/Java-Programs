class mathexcept {
    void divide() throws ArithmeticException {
        System.out.println(10 / 0);
    }
}

class exception4 {
    public static void main(String[] args) {
        mathexcept obj = new mathexcept();
        try {
            obj.divide();
        } catch (ArithmeticException e) {
            System.out.println("Chal hat");
        }
    }
}
