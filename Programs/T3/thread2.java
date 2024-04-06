// Creating thread using runnable interface

class prs implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Talking" + i);
        }
    }
}

class thread2 {
    public static void main(String[] args) {
        prs std = new prs();
        Thread obb = new Thread(std);
        obb.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Main RUnn " + i);
        }
    }
}