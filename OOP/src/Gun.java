// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Gun {
    private String caliber;
    private int clipSize;
    private boolean canned;

    public Gun(String type, int size, boolean supp) {
        this.caliber = type;
        this.clipSize = size;
        this.canned = supp;
    }

    public void supressGun() {
        this.canned = true;
    }

}

