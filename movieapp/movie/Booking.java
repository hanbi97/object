package movieapp.movie;

import movieapp.money.Money;

public class Booking {
    private Customer customer;
    private Screening screening;
    private Money money;
    private int customerCnt;

    public Booking(Customer customer, Screening screening, Money money, int customerCnt) {
        this.customer = customer;
        this.screening = screening;
        this.money = money;
        this.customerCnt = customerCnt;
    }
}
