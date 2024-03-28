class t2_seven {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        CallByValue obj = new CallByValue();
        obj.modValue(num);
        System.out.println(num);
    }
}

class CallByValue {
    void modValue(int num) {
        num = num * 2;
        System.out.println(num);
    }
}