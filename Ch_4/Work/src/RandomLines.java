import java.util.*;

public class RandomLines {
    public static void main(String[] args) {
        Random r = new Random();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        double repeater = Math.random() * 10;
        if (repeater < 5) {
            repeater += 5;
        }

        for (int j=0; j<80; j++) {
            for (int i = 0; i < (int)repeater; i++ ) {
                char letter = alphabet.charAt(r.nextInt(alphabet.length()));
                System.out.print(letter);
            }
            System.out.println();
        }


    }
}
