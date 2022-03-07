package movieapp;

import java.time.LocalDateTime;
import java.util.List;

public class Screening {
    private LocalDateTime screeningStart;
    private LocalDateTime screeningEnd;
    private Integer sequenceNumber;
    private Integer runningTime;
    private List<Booking> bookingList;

    public Screening(LocalDateTime screeningStart, LocalDateTime screeningEnd, Integer sequenceNumber, Integer runningTime) {
        this.screeningStart = screeningStart;
        this.screeningEnd = screeningEnd;
        this.sequenceNumber = sequenceNumber;
        this.runningTime = runningTime;
    }

    public void addBooking(Booking booking){
        bookingList.add(booking);
    }
}
