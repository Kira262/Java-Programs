class Product {
    int mul(int a, int b) {
        int prod = a * b;
        return prod;
    }

    int mul(int a, int b, int c) {
        int prod = a * b * c;
        return prod;
    }
}

class Main34 {
    public static void main(String[] args) {
        Product obj = new Product();
        System.out.println(obj.mul(2, 4));
        System.out.println(obj.mul(2, 4, 6));
    }
}