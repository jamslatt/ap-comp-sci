// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Handgun extends  Gun {
    private String action; // Sigle or doubble action

    public Handgun(String type, int size, boolean supp, String act) {
        super(type, size, supp);
        this.action = act;
    }

    public void  print() {
        super.print();
        System.out.println(" This is a " + action + " action handgun.");
    }

    public void getAction() {
        System.out.println(action);
    }
}
