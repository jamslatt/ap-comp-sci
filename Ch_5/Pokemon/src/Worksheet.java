// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Worksheet {
    private boolean isFishing;
    private boolean isFighting;
    private int hitPoints;

    public Worksheet(boolean fighting, boolean fishing, int hp) {
        isFighting = fighting;
        isFishing = fishing;
        hitPoints = hp;
    }

    public void damage(int amountOfDamage) {
        hitPoints -= amountOfDamage;
    }
}
