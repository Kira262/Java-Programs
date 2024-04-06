class per1 extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("bhak");
        }
    }
}

class mei1 {
    public static void main(String[] args) throws InterruptedException {
        per1 obj1 = new per1();
        obj1.start();
        obj1.join(1,20);
        for (int i = 0; i < 50; i++) {
            System.out.println("joinnn ");
        }
    }
}