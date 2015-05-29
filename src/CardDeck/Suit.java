package CardDeck;

/**
 * Created by Harsha on 5/29/2015.
 */
public class Suit {

    private final char suit;
    private final char color;

    public Suit() {

        this.suit = Suits.SPADES;
        this.color = Suits.BLACK;
    }

    public Suit(final char suit) {
        if(Suits.getAllSuits().indexOf(suit) != -1) {
            this.suit = suit;
            if(suit == Suits.CLUBS || suit == Suits.SPADES)
                this.color = Suits.BLACK;
            else
                this.color = Suits.RED;
        }
        else {
            this.suit = Suits.SPADES;
            this.color = Suits.BLACK;
        }
    }

    public char getSuit(){
        return suit;
    }

    public char getColor() {
        return color;
    }
    
}
