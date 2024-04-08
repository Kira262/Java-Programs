class Bowler extends Thread {
    @Override
    public void run() {
        Thread yorker = new Thread(() -> {
            System.out.println("SIXER");
        });

        Thread googly = new Thread(() -> {
            System.out.println("WICKET");
        });

        try {
            yorker.join(); // Wait for yorker to complete first
            yorker.setName("yorker");
            yorker.start();
            yorker.join(); // Ensure yorker completes before starting googly
            googly.setName("googly");
            googly.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

 class IPL {
    public static void main(String[] args) {
        Bowler bowler = new Bowler();
        bowler.start();
    }
}
