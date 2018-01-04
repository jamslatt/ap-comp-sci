// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class PokemonRunner {
    public static void main(String[] args) {
        Pokemon charamander = new Pokemon(39,52,43,60,50,65);
        Pokemon raichu = new Pokemon(62,39,60,100,29,30);

        if (charamander.returnHP() > raichu.returnHP())
            System.out.println("Charamander's HP is greater.");
        else
            System.out.println("Raichu's HP is greater.");
    }

}
