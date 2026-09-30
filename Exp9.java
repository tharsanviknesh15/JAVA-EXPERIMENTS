class ReservationThread extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ticket Reservation: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Reservation thread interrupted.");
        }
    }
}

class StatusThread implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ticket Confirmation: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Status thread interrupted.");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        ReservationThread reservation = new ReservationThread();

        StatusThread status = new StatusThread();
        Thread confirmation = new Thread(status);

        reservation.start();
        confirmation.start();
    }
}