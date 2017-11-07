public class makeGuesses {
    public static void main(String[] args) {
        int guessCount = 0;

        for (int i = 0; i < 10; i++) {
            double guess = Math.random() * 100;
            if ( guess > 50 )
                guess -= 50;
            System.out.println("Guess = " + (int)guess);
            guessCount += 1;
        }
        System.out.println("Total guesses: " + guessCount);
    }
}
