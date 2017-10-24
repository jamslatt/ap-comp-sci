import java.util.Scanner;


public class SovickIsGone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a sentance.");
        String input = scanner.nextLine();
        System.out.println("What would you like to search for?");
        String query = scanner.nextLine();
        System.out.println("The query is at position " + input.indexOf(query) + " in the sentance.");
        int result =  input.indexOf(query);
        System.out.print("Fun fact... that position squared is ");
        System.out.print(square(result));
        System.out.print(" and muliplied by pie is ");
        System.out.print(pi(result));
        System.out.print(" thats all folks! Enjoy!");

    }

    private static double pi (int amt) {
        return amt * Math.PI;
    }

    private static double square (int amt) {
        return Math.pow(amt, 2);
    }
}
