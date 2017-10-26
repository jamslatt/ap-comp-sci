import java.util.Scanner;

public class BattleProgramming {

    public static void main(String[] args) {
        battleStart();
        options();
    }

    // Allows user to slect their next move after game has ended.
    private static void options() {
        System.out.println("The game has ended. What would you like to do now?\nRestart\nStats\nEnd");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine().toUpperCase();
        if (option.equals("RESTART")) {
            battleStart();
        }
        else if (option.equals("STATS")) {
            stats();
        }
        else if (option.equals("END")) {
            System.out.print("\nGame over man.. game over.");
        }

    }

    // View pokemon stats
    public static void stats () {
        System.out.println("--------------------------------------\n      <<<< POKEMON STATS >>>>\n--------------------------------------\nType the name of pokemon whos stats you want to see...\n We have stats for: Pikachu and Glabadaba.");
        Scanner scanner = new Scanner(System.in);
        String statsFor = scanner.nextLine();

        if (statsFor.toUpperCase().equals("PIKACHU") || statsFor.toUpperCase().equals("GLABADABA")) {
           NewPokemon pikachu = new NewPokemon(10,21,30,51,5,162);
           NewPokemon glabadaba = new NewPokemon(15,21,15,25,7,96);
           if (statsFor.toUpperCase().equals("PIKACHU")) {
               System.out.println("*-----------------------------*");
               System.out.println("| Name: Pikachu |  Level: 10  |");
               System.out.println("| Defense: 30   |  Base: 30   |");
               System.out.println("| STAB: 5       |  HP: 162    |");
               System.out.println("*-----------------------------*");
               options();
           }
           else if (statsFor.toUpperCase().equals("GLABADABA")) {
               System.out.println("*-------------------------------*");
               System.out.println("| Name: Glabadaba |  Level: 15  |");
               System.out.println("| Defense: 15     |  Base: 25   |");
               System.out.println("| STAB: 7         |  HP: 96     |");
               System.out.println("*-------------------------------*");
               options();
           }
        }
        else {
            System.out.println("Sorry, that pokemons stats are not found in this database.");
            options();
        }


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
        System.out.println("Which Pokemon do you choose? (Pikachu, Glabadaba)");
        Scanner scanner = new Scanner(System.in);
        String UserPokemon = scanner.nextLine();
        if (UserPokemon.toUpperCase().equals("PIKACHU") || UserPokemon.toUpperCase().equals("GLABADABA")) {
            System.out.println("You chose " + UserPokemon + ".\n\nIt is a battle between " + UserPokemon + " and " + enemy + "!");
            NewPokemon pokemon = new NewPokemon(10,100,100,100,100,200);

            // Damage
            double damage = damage(pokemon.level, pokemon.attack,pokemon.defense,pokemon.base,pokemon.STAB);
            pokemon.HP -= damage;
            System.out.println(UserPokemon + " sustained " + damage + " damage points! " + UserPokemon + " health points left is " + pokemon.HP + ".");
        }
        else {
            System.out.println("You chose " + UserPokemon + ".\n\nIt is a battle between " + UserPokemon + " and " + enemy + "!\n\n Please define " + UserPokemon + " stats...");
            System.out.println("Level?");
            int level = scanner.nextInt();
            if (level > 10) {
                System.out.println("Please pick a number Between 0-10");
            }
            else if (level <= 0) {
                System.out.println("You must pick a positive level between 1-10.");
            }
            else {
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
                NewPokemon pokemon = new NewPokemon(level, attack, defense, base, STAB, HP);

                // Damage
                double damage = damage(pokemon.level, pokemon.attack, pokemon.defense, pokemon.base, pokemon.STAB);
                pokemon.HP -= damage;
                System.out.println(UserPokemon + " sustained " + damage + " damage points! " + UserPokemon + " health points left is " + pokemon.HP + ".");
            }
        }




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
