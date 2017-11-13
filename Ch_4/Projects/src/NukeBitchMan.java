import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NukeBitchMan {
    public static void main(String[] args) {
        game(opponent());
    }

    public static void menu() {

        System.out.println("--------------------------------------\n               Menu\n--------------------------------------\nOPTIONS.\nPlay Again\nStats\nEnd");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.nextLine();
        if (select.toUpperCase().equals("PLAY AGAIN"))
            game(opponent());
        else if (select.toUpperCase().equals("STATS"))
            System.out.println("stata");
        else if (select.toUpperCase().equals("END"))
            System.out.println("Bye bye.");
        else {
            System.out.println("That was not an option.");
            menu();
        }

    }

    // Start game
    public static void game(String opponent) {
        System.out.println("--------------------------------------\n               Nuke Bitch Man\n--------------------------------------");
        System.out.println("Pick your player? (Nuke, B*#!h, Man)");
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        System.out.println("You picked " + player + "!");

        try {
            Thread.sleep(1000);

            System.out.println("Nuke!");
            Thread.sleep(1000);
            System.out.println("B*#!h!");
            Thread.sleep(1000);
            System.out.println("Man!");


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("********** " + player + "  VS  " + opponent + " **********");

        winner(player.toUpperCase(), opponent);


        menu();

    }

    public static void stats() {

    }


    public static String opponent() {
        double selector = Math.random();
        if (selector <= 33.33)
            return "NUKE";
        if (selector > 33.33 && selector <= 66.66)
            return "B*#!H";
        if (selector > 66.66)
            return "MAN";
        else
            return "MAN";

    }

    public static void winner(String player, String opponent) {
        int win = 0;
        int loose = 0;

        if ((player.equals("NUKE") && opponent.equals("B*#!H")) || (player.equals("B*#!H") && opponent.equals("NUKE"))) {
            System.out.println("Nuke Wins.");
            if (!player.equals("NUKE"))
                System.out.println("You lost!! Ha ha u suck!");
            else
                win += 1;
        }


        if ((player.equals("NUKE") && opponent.equals("MAN")) || (player.equals("MAN") && opponent.equals("NUKE"))) {
            System.out.println("MAN wins.");
            if (!player.equals("MAN"))
                loose += 1;
                System.out.println("You lost!! Ha ha u suck!");
            if (player.equals("MAN"))
                win += 1;
        }

        if (player.equals(opponent))
            System.out.print("Tie.");

        if ((player.equals("MAN") && opponent.equals("B*#!H")) || (player.equals("B*#!H") && opponent.equals("MAN"))) {
            System.out.println("Bitch wins.");
            if (!player.equals("B*#!H"))
                loose += 1;
                System.out.println("You lost!! Ha ha u suck!");
            if (player.equals("B*#!H"))
                win += 1;
        }




    }


}
