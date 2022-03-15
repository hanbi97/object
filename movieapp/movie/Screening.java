package movieapp.movie;

import movieapp.money.Money;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie; //연결된 영화
    private int sequence; //상영순서(순번 할인 조건 있음)
    private LocalDateTime startTime; // 러닝타임은 영화에 들어가는 조건

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.startTime = whenScreened;
    }

    public LocalDateTime getStartTime(){
        return startTime;
    }

    public boolean isSequence(int sequence){
        return this.sequence==sequence;
    }

    public Money getMovieFee(){
        return movie.getFee();
    }

    public Money calculateFee(int customerCnt){
        return movie.calculateMovieFee(this).times(customerCnt);
    }

    public Booking book(Customer customer, int customerCnt){
        return new Booking(customer, this, calculateFee(customerCnt), customerCnt);
    }
}
