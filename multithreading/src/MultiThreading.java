import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreading {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);

        for (int requestId = 1; requestId <= 5; requestId++) {
            pool.execute((new TicketBookingRequest("Booking Request " + requestId)));
        }
        pool.shutdown();
    }
}