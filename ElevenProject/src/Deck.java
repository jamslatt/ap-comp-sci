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
    }

    public boolean isEmpty() {
        if (cards.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return cards.size();
    }

    public Card deal() {
        Card card = cards.get(cards.size());
        cards.remove(cards.size());
        return card;
    }
}
