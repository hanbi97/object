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

    public boolean hasInvitation(){
        return invitation !=null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean hasTicket(){
        return ticket!=null;
    }

    public void plusCash(Long cash){
        this.cash=cash;
    }

    public void minusCash(Long cash){
        this.cash-=cash;
    }
}
