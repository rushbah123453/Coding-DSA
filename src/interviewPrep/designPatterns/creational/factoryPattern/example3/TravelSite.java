package interviewPrep.designPatterns.creational.factoryPattern.example3;

public class TravelSite {
    public static void main(String[] args) {
        TicketFactory ticket = new TicketFactory();
        Ticket ticket1 = ticket.getTicket("Flight");
        ticket1.bookTicket();
    }
}
