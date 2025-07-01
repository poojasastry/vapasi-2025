import java.util.logging.Logger;

class TicketBookingRequest implements Runnable {
    String ticketBookingRequestName;

    TicketBookingRequest(String ticketBookingRequestName) {
        this.ticketBookingRequestName = ticketBookingRequestName;
    }

    @Override
    public void run() {
        Logger LOGGER = Logger.getLogger(TicketBookingRequest.class.getName());
        LOGGER.info("Booking received for " + ticketBookingRequestName + " in " + Thread.currentThread().getName());
        LOGGER.info("Payment processed for " + ticketBookingRequestName + " in " + Thread.currentThread().getName());
        LOGGER.info("Ticket confirmed for " + ticketBookingRequestName + " in " + Thread.currentThread().getName());
    }
}
