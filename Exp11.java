class Printer {
    synchronized void printDocument() {
        System.out.println(Thread.currentThread().getName()
                + " is printing...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName()
                + " finished printing.");
    }
}

class UserThread extends Thread {
    Printer p;

    UserThread(Printer p, String name) {
        super(name);
        this.p = p;
    }

    public void run() {
        System.out.println(getName() + " started.");
        p.printDocument();
        System.out.println(getName() + " terminated.");
    }
}

public class EXPERIMENT11 {
    public static void main(String[] args)
            throws InterruptedException {
        Printer p = new Printer();

        UserThread t1 = new UserThread(p, "User-1");
        UserThread t2 = new UserThread(p, "User-2");

        System.out.println("Initial State: " + t1.getState());

        t1.start();
        t2.start();

        Thread.sleep(100);
        System.out.println("Current State: " + t1.getState());

        t1.join();
        t2.join();

        System.out.println("Final State: " + t1.getState());
        System.out.println("Deadlock prevented using synchronization.");
    }
}