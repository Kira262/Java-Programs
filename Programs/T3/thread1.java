// class thr implements Runnable {
// public void start() {
// for (int i = 0; i < 30; i++) {
// System.out.println("haha THat's what she said " + i);
// }
// }
// }

class thread1 {
    public static void main(String[] args) {
        // thr stt = new thr();
        Thread obj1 = new Thread();
        obj1.run();

        for (int i = 0; i < 30; i++) {
            System.out.println("AAAA");
        }
    }
}