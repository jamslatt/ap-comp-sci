import java.util.ArrayList;
import java.util.List;

public class Deck {
    
    private final List<Card> cards = new ArrayList<Card>();

    public Deck(String ranks[], String suits[], int values[] ) {
        for (String suit : suits) {
            for (int i = 0; i < values.length; i++) {
                Card card = new Card(ranks[i], suit, values[i]);
                cards.add(card);
            }
        }
        shuffle();

    }

    public boolean isEmpty() {
        return cards.size() <= 0;
    }

    public int size() {
        return cards.size();
    }

    public Card deal() {
        int size = cards.size();
        if (isEmpty()) {
            return null;
        }
        size--;
        Card c = cards.get(size);
        return c;
    }

    public void shuffle() {
        for (int k = cards.size() - 1; k > 0; k--) {
            int howMany = k + 1;
            int start = 0;
            int randPos = (int) (Math.random() * howMany) + start;
            Card temp = cards.get(k);
            cards.set(k, cards.get(randPos));
            cards.set(randPos, temp);
        }
        //size = cards.size();
    }

    @Override
    public String toString() {
        int size = cards.size();
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}


