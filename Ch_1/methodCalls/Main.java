
/**
James Slattery
Intro to Static Methods and call methods
 */
import java.util.Scanner;

public class Main {
    // Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many boxes do you want to print?");
        int num = scanner.nextInt();
        System.out.println();
        printBox(num);
    }
    // Loops the box three times.
    public static void printBox(int boxes) {
        for (int i=0; i < boxes; i++) {
            System.out.println("+------+");
            System.out.println("|      |");
            System.out.println("|      |");
            System.out.println("+------+");
            System.out.println();
            
        }
    }

}
