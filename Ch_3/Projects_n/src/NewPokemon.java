public class NewPokemon {
    public int level;
    public int attack;
    public int defense;
    public int base;
    public int STAB;
    public int HP;

    public NewPokemon (int level,int attack, int defense, int base, int STAB, int HP) {

        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.base = base;
        this.STAB = STAB;
        this.HP = HP;


    }

    public int getAttack() {
        return attack;
    }
}
