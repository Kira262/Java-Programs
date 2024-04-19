import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer[]> buffer;

    public Producer(BlockingQueue<Integer[]> buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 6; i++) {
            Integer[] info = { i, i % 2 == 0 ? 1 : 2 }; // Alternate between consumers
            try {
                buffer.put(info); // Put information in the buffer
                System.out.println("Producer produced: " + info[0] + " for Consumer " + info[1]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private int id;
    private BlockingQueue<Integer[]> buffer;

    public Consumer(int id, BlockingQueue<Integer[]> buffer) {
        this.id = id;
        this.buffer = buffer;
    }

    public void run() {
        while (true) {
            try {
                Integer[] info = buffer.take(); // Take information from the buffer
                if (info[1] == id) {
                    System.out.println("Consumer " + id + " consumed: " + info[0]);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer[]> buffer = new ArrayBlockingQueue<>(1);

        // Create and start producer thread
        Thread producerThread = new Thread(new Producer(buffer));
        producerThread.start();

        // Create and start two consumer threads
        Thread consumer1Thread = new Thread(new Consumer(1, buffer));
        Thread consumer2Thread = new Thread(new Consumer(2, buffer));
        consumer1Thread.start();
        consumer2Thread.start();
    }
}
