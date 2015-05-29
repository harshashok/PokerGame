package CardDeck;

/**
 * Created by Harsha on 5/29/2015.
 */
public class Card implements ICard {


    private final Rank rank;
    private final Suit suit;

    public Card() {
        this.rank = new Rank();
        this.suit = new Suit();
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getColor() {
        return null;
    }

    public String getSuit() {
        return null;
    }

    public String getIcon() {
        return null;
    }

    public String getRank() {
        return null;
    }

    public String getStringNotation() {
        return null;
    }

    public String getHandNotation() {
        return null;
    }

    public String getPokerNotation() {
        return null;
    }
}
