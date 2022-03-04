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

    public void sellTicketTo(Audience audience){
        plusAmount(audience.buy(getTicket()));
    }
    private Ticket getTicket(){
        return ticketsList.remove(0);
    }

    private void plusAmount(Long amount){
        this.amount+=amount;
    }
}
