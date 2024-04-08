class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();
        childThread.start();
    }
}
