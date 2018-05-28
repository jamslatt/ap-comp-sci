// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Athlete extends Person {
    private int fuegoSent;

    public Athlete(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.probation = false;
        this.notes = null;
        this.fuegoSent = 0;
    }

    public void sendFuego() {
        fuegoSent++;
        System.out.println("Noted... added " + name + " to send que for Fuego Energy.");
    }
}
