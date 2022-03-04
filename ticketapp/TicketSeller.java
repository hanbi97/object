package ticketapp;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

   public void sellTo(Audience audience){ //encapsulation
       ticketOffice.sellTicketTo(audience); //ticketOffice와 audience 사이 새로운 의존성 추가
   }
}
