// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public abstract class Ticket {
    private int ticketId;

    public Ticket (int n){
        this.ticketId = n;
    }

    public abstract int getPrice();

    public int getTicketId() {
        return ticketId;
    }

    public String toString() {
        return "Number: " + this.ticketId + " Price: " + this.getPrice();
    }

}
