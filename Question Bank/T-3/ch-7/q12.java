import java.util.LinkedList;

class SharedBuffer {
    private final LinkedList<Integer> buffer;
    private final int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new LinkedList<>();
    }

    public synchronized void produce(int item, String producerName) throws InterruptedException {
        while (buffer.size() == capacity) {
            System.out.println("Buffer is full. " + producerName + " is waiting...");
            wait();
        }
        buffer.add(item);
        System.out.println(producerName + " produced: " + item);
        notifyAll();
    }

    public synchronized int consume(String consumerName) throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer is empty. " + consumerName + " is waiting...");
            wait();
        }
        int item = buffer.removeFirst();
        System.out.println(consumerName + " consumed: " + item);
        notifyAll();
        return item;
    }
}

class Producer implements Runnable {
    private final SharedBuffer buffer;
    private final String name;

    public Producer(SharedBuffer buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i, name);
                Thread.sleep(1000); // Simulating some work
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private final SharedBuffer buffer;
    private final String name;

    public Consumer(SharedBuffer buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.consume(name);
                Thread.sleep(1500); // Simulating some work
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Main {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(3); // Buffer with capacity 3

        Producer producer1 = new Producer(buffer, "Producer 1");
        Producer producer2 = new Producer(buffer, "Producer 2");
        Consumer consumer1 = new Consumer(buffer, "Consumer 1");
        Consumer consumer2 = new Consumer(buffer, "Consumer 2");

        Thread producerThread1 = new Thread(producer1);
        Thread producerThread2 = new Thread(producer2);
        Thread consumerThread1 = new Thread(consumer1);
        Thread consumerThread2 = new Thread(consumer2);

        producerThread1.start();
        producerThread2.start();
        consumerThread1.start();
        consumerThread2.start();
    }
}
