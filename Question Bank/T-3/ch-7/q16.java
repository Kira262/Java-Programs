class Receiver {
    public synchronized void receiveCall(String callerName) {
        System.out.println("Ringing... Caller: " + callerName);
    }
}

class Caller extends Thread {
    private Receiver receiver;
    private String callerName;

    public Caller(Receiver receiver, String callerName) {
        this.receiver = receiver;
        this.callerName = callerName;
    }

    @Override
    public void run() {
        receiver.receiveCall(callerName);
    }
}

class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Caller caller1 = new Caller(receiver, "Caller1");
        Caller caller2 = new Caller(receiver, "Caller2");

        caller1.start();
        caller2.start();
    }
}
