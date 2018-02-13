// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class AdvanceTicket extends Ticket {
    private int DaysBeforeEvent;

    public AdvanceTicket( int daysBeforeEvent, int number) {
        super(number);
        this.DaysBeforeEvent = daysBeforeEvent;
    }

    public int getPrice() {
        if (this.DaysBeforeEvent >= 10){
            return 30;
        }
        else  {
            return 40;
        }
    }

    public boolean raffle() {
        int winner = (int)(Math.random() * 100);
        if (this.getTicketId() == winner) {
            return true;
        }
        else {
            return false;
        }
    }
}

