class Buffer {
    int data;
    boolean available = false;

    synchronized void produce(int value) {
        try {
            while (available)
                wait();

            data = value;
            System.out.println("Produced: " + data);
            available = true;
            notifyAll();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    synchronized void consume() {
        try {
            while (!available)
                wait();

            System.out.println("Consumed: " + data);
            available = false;
            notifyAll();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Producer extends Thread {
    Buffer b;

    Producer(Buffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++)
            b.produce(i);
    }
}

class Consumer extends Thread {
    Buffer b;

    Consumer(Buffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++)
            b.consume();
    }
}

public class EXPERIMENT10 {
    public static void main(String[] args)
            throws InterruptedException {

        Buffer b = new Buffer();

        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();

        p.join();
        c.join();
    }
}