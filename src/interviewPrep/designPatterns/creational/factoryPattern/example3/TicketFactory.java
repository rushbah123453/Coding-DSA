package interviewPrep.designPatterns.creational.factoryPattern.example3;

public class TicketFactory {
    public Ticket getTicket(String ticketType) {
        switch(ticketType) {
            case "Bus": return new Bus();
            case "Train": return new Train();
            case "Flight": return new Flight();
            default: return null;
        }
    }
}
