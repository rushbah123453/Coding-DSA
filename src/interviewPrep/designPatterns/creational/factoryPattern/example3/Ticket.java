package interviewPrep.designPatterns.creational.factoryPattern.example3;

public interface Ticket {
    void bookTicket();
}

class Bus implements Ticket {
    @Override
    public void bookTicket() {
        System.out.println("Book Bus Ticket");
    }
}

class Train implements Ticket {
    @Override
    public void bookTicket() {
        System.out.println("Book Train Ticket");
    }
}

class Flight implements Ticket {
    @Override
    public void bookTicket() {
        System.out.println("Book Flight Ticket");
    }
}
