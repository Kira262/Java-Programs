class MorningRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class AfternoonRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Good Afternoon");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Thread morningThread = new Thread(new MorningRunnable());
        Thread afternoonThread = new Thread(new AfternoonRunnable());

        morningThread.start();
        afternoonThread.start();
    }
}
