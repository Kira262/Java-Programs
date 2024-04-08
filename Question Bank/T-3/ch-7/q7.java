class SharedBuffer {
    private int data;
    private String source;
    private String destination;
    private boolean available = false;

    public synchronized void put(int data, String source, String destination) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        this.source = source;
        this.destination = destination;
        available = true;
        System.out.println("Produced: " + data + " from " + source + " to " + destination);
        notifyAll();
    }

    public synchronized int get(String consumerName) {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        available = false;
        System.out.println(consumerName + " consumed: " + data + " from " + source + " to " + destination);
        notifyAll();
        return data;
    }
}

class ProducerConsumerThread extends Thread {
    private SharedBuffer buffer;
    private String producerName;
    private String consumerName;

    public ProducerConsumerThread(SharedBuffer buffer, String producerName, String consumerName) {
        this.buffer = buffer;
        this.producerName = producerName;
        this.consumerName = consumerName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.put(i, producerName, consumerName);
            buffer.get(consumerName);
        }
    }
}

class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        ProducerConsumerThread producer1 = new ProducerConsumerThread(buffer, "Producer 1", "Consumer 1");
        ProducerConsumerThread producer2 = new ProducerConsumerThread(buffer, "Producer 2", "Consumer 2");

        producer1.start();
        producer2.start();
    }
}
