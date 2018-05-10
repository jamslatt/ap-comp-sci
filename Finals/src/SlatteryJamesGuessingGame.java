/**
 * Created by james on 5/10/2018.
 */
import java.util.Scanner;

public class SlatteryJamesGuessingGame {
    public static void main(String[] args) {
        menu();
    }

    private static void menu () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("//////////\\\\\\\\\\\\\\\\\\\\\n    THE GUESSING GAME\n//////////\\\\\\\\\\\\\\\\\\\\\nWhat would you like to do? (Play, Exit, Stats)");
        String input = scanner.nextLine();
        if (input.toUpperCase().equals("PLAY")) {
            run();
        }
        if (input.toUpperCase().equals("EXIT")) {
            System.out.println("Bye bye...");
        }
        if (input.toUpperCase().equals("STATS")) {
            displayStats();
        }
    }

    private static void run() {
        int goal = generateNumber();
        int guess = 0;
        int guessCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Start guessing numbers!");

        while(guess != goal || guess == -1) {
            guess = scanner.nextInt();
            guessCount++;

            if (guess < goal) {
                System.out.println("wrong.. try again, your guess is smaller than the target number.");
            }
            else {
                System.out.println("wrong.. try again, your guess is larger than the target number.");
            }
        }

        System.out.println("Wow! You got it! Only took " + guessCount + " tries.");

        addNewCount(guessCount);

        menu();

    }

    private static int countsAdded = 0;
    private static int guessCountAvg = 0;
    private static void addNewCount(int n) {
        countsAdded++;
        guessCountAvg = (guessCountAvg + n) / countsAdded;
    }

    private static void displayStats() {
        System.out.println("\n---- STATS ----\nAverage Guess Atempts Per Game: " + guessCountAvg + "\n You have played " + countsAdded + " rounds.");
        menu();
    }

    // Generate number 1-100
    private static int generateNumber() {
        return (int) (Math.random() * 100);
    }
}
