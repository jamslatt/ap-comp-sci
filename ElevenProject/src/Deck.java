// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;
    private  int size;

    public Deck(String ranksIn[],String suitsIn[], int valauesIn[] ) {
        // Put cards in cards<>
        this.cards = new ArrayList<Card>();

        for (int i = 0; i < valauesIn.length; i++) {
            Card temp = new Card(ranksIn[0], suitsIn[0], valauesIn[0]);
            this.cards.add(temp);
        }
        // Assign size
        this.size = cards.size();

    }

    public boolean isEmpty() {
        if (this.cards.size() > 0)
            return true;
        else
            return false;
    }

    public int size() {
        return this.cards.size();
    }

    public Card deal() {
        // So long as there are cards to get this will do it
        this.size--;
        return cards.get(this.size);
        // Add card size < 0 exceptor

    }

}
