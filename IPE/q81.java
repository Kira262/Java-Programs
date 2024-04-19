class MorningThread implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AfternoonThread implements Runnable {
    public void run() {
        while (true) {
            try {
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class GreetingThreads {
    public static void main(String[] args) {
        // Create and start MorningThread
        Thread morningThread = new Thread(new MorningThread());
        morningThread.start();

        // Create and start AfternoonThread
        Thread afternoonThread = new Thread(new AfternoonThread());
        afternoonThread.start();
    }
}
