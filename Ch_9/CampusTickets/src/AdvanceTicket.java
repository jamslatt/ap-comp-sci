// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class AdvanceTicket extends Ticket {
    int DaysBeforeEvent;

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
}
