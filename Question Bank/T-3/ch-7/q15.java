class PVR {
    private int totalSeats;

    public PVR(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public synchronized void bookSeat(String threadName) {
        if (totalSeats > 0) {
            System.out.println(threadName + " is booking a seat...");
            totalSeats--;
            System.out.println("Seat booked successfully by " + threadName + ". Remaining seats: " + totalSeats);
        } else {
            System.out.println("Sorry, no seats available for " + threadName);
        }
    }
}

class BookingThread extends Thread {
    private PVR pvr;
    private String threadName;

    public BookingThread(PVR pvr, String threadName) {
        this.pvr = pvr;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            pvr.bookSeat(threadName);
            try {
                Thread.sleep(1000); // Simulate some processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        PVR screen1 = new PVR(10); // Assuming total seats for screen1 is 10

        BookingThread thread1 = new BookingThread(screen1, "Thread 1");
        BookingThread thread2 = new BookingThread(screen1, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
