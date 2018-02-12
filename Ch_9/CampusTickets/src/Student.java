// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Student extends Ticket {
    private boolean before10Days;

    public Student(int number, boolean bf10) {
        super(number);
        this.before10Days = bf10;
    }

    public int getPrice() {
        if (this.before10Days) {
            return 15;
        }
        else {
            return 20;
        }
    }

    @Override
    public String toString() {
        return "Number: " + super.getTicketId() + " Price: " + this.getPrice() + " STUDENT ID REQUIREDDDDDDDD!!!!!!!";
    }
}
