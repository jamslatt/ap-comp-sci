// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class SBRGun extends Gun {
        private double bLength;

    public SBRGun(String type, int size, boolean supp, double barrel) {
        super(type, size, supp);
        this.bLength = barrel;
    }

    public double getBarrelLength() {
            return bLength;
        }

}

