import java.util.Scanner;

public class BattleProgramming {
    public static void main(String[] args) {
        battleStart();
        options();



    }

    // Allows user to slect their next move after game has ended.
    private static void options() {
        System.out.println("The game has ended. What would you like to do now?\nRestart\nStats");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine().toUpperCase();
        if (option.equals("RESTART")) {
            battleStart();
        }
        else if (option.equals("STATS")) {
            stats();
        }

    }

    // View pokemon stats
    public static void stats () {
        System.out.println("--------------------------------------\n      <<<< POKEMON STATS >>>>\n--------------------------------------\nType the name of pokemon whos stats you want to see...");
        Scanner scanner = new Scanner(System.in);
        String statsFor = scanner.nextLine().toUpperCase();



    }


    // Damage
    private static double damage(int level, int attack, int defense, int base, int STAB) {
        double modifier = STAB * Math.random() * ( 1.0 - 0.85 );
        return  (((2*level*10)/250)*(attack/defense)*base+2) * modifier;
    }

    // Starts Battle
    public static void battleStart() {
        System.out.println("--------------------------------------\n      <<<< POKEMON BATTLE >>>>\n--------------------------------------\nAnother trainer is issuing a challenge!");
        String enemy = generateOpponent();
        System.out.println( enemy + " appeared.");
        System.out.println("Which Pokemon do you choose?");
        Scanner scanner = new Scanner(System.in);
        String UserPokemon = scanner.nextLine();
        System.out.println("You chose " + UserPokemon + ".\n\nIt is a battle between " + UserPokemon + " and " + enemy + "!\n\n Please define " + UserPokemon + " stats...");
        System.out.println("Level?");
        int level = scanner.nextInt();
        System.out.println("Attack?");
        int attack = scanner.nextInt();
        System.out.println("Defense?");
        int defense = scanner.nextInt();
        System.out.println("Base?");
        int base = scanner.nextInt();
        System.out.println("STAB?");
        int STAB = scanner.nextInt();
        System.out.println("HP?");
        int HP = scanner.nextInt();
        System.out.println(UserPokemon + ": Level " + level + " Attack " + attack + " Defense " + defense + " Base " + base + " STAB " + STAB + " HP " + HP + ".");
        NewPokemon pokemon = new NewPokemon(level,attack,defense,base,STAB,HP);
        double damage = damage(pokemon.level, pokemon.attack,pokemon.defense,pokemon.base,pokemon.STAB);
        pokemon.HP -= damage;
        System.out.println(UserPokemon + " sustained " + damage + " damage points! " + UserPokemon + " health points left is " + pokemon.HP + ".");



    }

    // Generates Opponent
    private static String generateOpponent() {
        String[] opponents = {"Zebstrika", "Pikachu","Chappadsada","Jukabooka"};
        double selector = Math.random() * 100;

        if (selector < 25) {
            return opponents[0];
        }
        else if (selector >= 25 || selector < 50) {
            return opponents[1];
        }
        else if (selector >= 50 || selector < 75 ) {
            return opponents[2];
        }
        else if (selector >=75 || selector <= 100 ) {
            return opponents[3];

        }
        else {
            System.out.println("Error. Could not find an opponent. Selector ID = " + selector );
        }
        return "error";

    }
}
