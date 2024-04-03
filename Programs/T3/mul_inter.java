interface int1 {
    default void show() {
        System.out.println("Int 1");
    }
}

interface int2 {
    default void show() {
        System.out.println("Int 2");
    }
}

class test implements int1, int2 {
    public void show() {
        System.out.println("Test 1");
    }

    public void showInt1() {
        int1.super.show();
    }

    public void showInt2() {
        int2.super.show();
    }
}

class mul_inter {
    public static void main(String[] args) {
        test tt = new test();
        tt.show();
        tt.showInt1();
        tt.showInt2();
        int1 i1 = new test();
        i1.show();
        int2 i2 = new test();
        i2.show();
    }
}