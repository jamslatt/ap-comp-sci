// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

    private String suit;
    private String rank;
    private int pointValue;


    /**
     * Creates a new <code>Card</code> instance.
     *
     * @param cardRank       a <code>String</code> value
     *                       containing the rank of the card
     * @param cardSuit       a <code>String</code> value
     *                       containing the suit of the card
     * @param cardPointValue an <code>int</code> value
     *                       containing the point value of the card
     */
    public Card(String cardRank, String cardSuit, int cardPointValue) {
        this.rank = cardRank;
		this.suit = cardSuit;
		this.pointValue = cardPointValue;
    }

    /////////////////////////
    // Accessorrrrzzzz
    ////////////////////////
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getPointValue() {
        return pointValue;
    }

    /////////////////////////
    // Equality
    /////////////////////////
    public boolean isEqualTo(Card n) {
        if ((this.rank.equals(n.rank)) && (this.suit.equals(n.suit)) && (this.pointValue == n.pointValue)) {
            return true;
        }
        else  {
            return false;
        }
    }

    /////////////////////////
    // String Beanz
    /////////////////////////
    @Override
    public String toString() {
        return this.rank + " of " + this.suit + " (point value =" + pointValue + ")";
    }
}


