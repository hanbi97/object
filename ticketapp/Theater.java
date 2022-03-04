package ticketapp;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){
        Ticket ticket = ticketSeller.getTicketOffice().getTicket();
        if(audience.getBag().hasInvitation()){//event
            audience.getBag().setTicket(ticket);
        }else{
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().minusCash(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
