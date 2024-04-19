class Buffer {
    private int data;
    private String source;
    private String destination;
    private boolean available = false;

    // Method to put data into the buffer
    public synchronized void put(int data, String source, String destination) {
        while (available) {
            try {
                wait(); // Wait while buffer is not available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.data = data;
        this.source = source;
        this.destination = destination;
        available = true;
        notifyAll(); // Notify waiting threads that data is available
    }

    // Method to get data from the buffer
    public synchronized void get() {
        while (!available) {
            try {
                wait(); // Wait while buffer is not available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumer: " + Thread.currentThread().getName() +
                " received data " + data + " from " + source +
                " and sending it to " + destination);
        available = false;
        notifyAll(); // Notify waiting threads that buffer is empty
    }
}

class ProdCon implements Runnable {
    private Buffer buffer;
    private String source;
    private String destination;

    public ProdCon(Buffer buffer, String source, String destination) {
        this.buffer = buffer;
        this.source = source;
        this.destination = destination;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.put(i, source, destination);
            buffer.get();
        }
    }
}

class ProducerConsumerDemo {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        // Instantiate two producer-consumer pairs
        Thread producer1 = new Thread(new ProdCon(buffer, "Producer1", "Consumer1"));
        Thread producer2 = new Thread(new ProdCon(buffer, "Producer2", "Consumer2"));

        producer1.start();
        producer2.start();
    }
}
