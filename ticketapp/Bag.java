package ticketapp;

//관객들은 소지품을 가방에 넣고 들어온다
public class Bag {
    private Invitation invitation;
    private Ticket ticket;
    private Long cash;

    public Bag(Invitation invitation){//이벤트 당첨
        this.invitation=invitation;
    }

    public Bag(Ticket ticket, Long cash){
        this.ticket=ticket;
        this.cash=cash;
    }

    public Long hold(Ticket ticket){
       if(hasInvitation()){//event
            setTicket(ticket);
            return 0L;
        }else{
            minusCash(ticket.getFee());
            setTicket(ticket);
        }
       return ticket.getFee();
    }

    private boolean hasInvitation(){
        return invitation !=null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusCash(Long cash){
        this.cash-=cash;
    }
}
