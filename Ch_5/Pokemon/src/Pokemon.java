////////////////////////////////
// By James Slattery          //
// Pokemon Game Thing         //
// GitHub: @jamslatt          //
// /ap-comp-sci/Ch_5/Pokemon  //
////////////////////////////////

public class Pokemon {
    // Fields
    private int hp; // Hit Points
    private int attack; // Attack damage (how many hp you take away from an opponent on each attack?)
    private int defense; // Defense points
    private int specialAttack; // Special Attack damage points
    private int specialDefense;
    private int speed;

    // Instance Methods
    public int sumStats() {
        return hp + attack + specialAttack + defense;
    }

    public void consumeVitamin(int hpUP, int protein) {
        hp += hpUP;
        attack += protein;
    }

    public void compare(Pokemon first, Pokemon second) {
        if (first.hp > second.hp)
            System.out.println("The first Pokemons HP is greater than the seconds.");
        else
            System.out.println("The second Pokemons HP is greater than the firsts.");
    }

    public int returnHP() {
        return hp;
    }
    // Constructor

    public Pokemon(int hitpoints, int att, int def, int sAtt, int sDef, int sp) {
        hp = hitpoints;
        attack = att;
        defense = def;
        specialAttack = sAtt;
        specialDefense = sDef;
        speed = sp;
    }
}
