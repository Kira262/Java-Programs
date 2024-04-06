class t1 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}

class thread3 {
    public static void main(String[] args) {
        t1 t = new t1();
        // t.run();
        // t.start();
        System.out.println(t.getName());
        t.setName("HElp TF");
        System.out.println(t.getName());
    }
}