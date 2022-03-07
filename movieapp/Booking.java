package movieapp;

public class Booking {
    private Long count;
    private Long payment;

    public Booking(Long count, Long payment) {
        this.count = count;
        this.payment = payment;
    }

    public void booking(Long count, Long payment, Screening screening){
        Booking booking  = new Booking(count, payment);
        screening.addBooking(booking);
    }
}
