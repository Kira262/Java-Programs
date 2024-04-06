class myt1 extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            for (int i = 0; i < 15; i++) {
                System.out.println("RUNN JAck Run");
            }
        }
    }
}

class myt2 extends Thread {
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("RUNN simran Run");
        }
    }
}

class thread4 {
    public static void main(String[] args) {
        myt1 tt1 = new myt1();
        myt2 tt2 = new myt2();
        tt1.run();
        tt2.run();
        // tt1.setPriority(1);
        // System.out.println(tt1.getPriority());
        // tt2.setPriority(9);
        // System.out.println(tt2.getPriority());

    }
}