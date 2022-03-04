package ticketapp;

import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private List<Ticket> ticketsList;
    private Long amount;

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.ticketsList.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket(){
        return ticketsList.remove(0);
    }

    public void plusAmount(Long amount){
        this.amount+=amount;
    }

    public void minusAmount(Long amount){
        this.amount-=amount;
    }
}
