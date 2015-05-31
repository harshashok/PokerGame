package CardDeck;

/**
 * Created by Harsha on 5/29/2015.
 */
public class Card implements ICard {


    private final Rank rank;
    private final Suit suit;

    private final String handNotation;
    private final String pokerNotation;
    private final String stringNotation;


    public Card() {
        this(new Rank(Ranks.ACE), new Suit(Suits.SPADES));
    }

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;

        handNotation = "" + getRank() + getSuit();
        pokerNotation = "" + this.rank.getRank()+getIcon();
        stringNotation = "";
    }

    public String getColor() {
        return ""+suit.getColor();
    }

    public String getSuit() {
        return ""+this.suit.getSuit();
    }

    public String getIcon() {

        switch(this.suit.getSuit()){

            case Suits.CLUBS : return ""+Suits.I_CLUBS;
            case Suits.DIAMOND: return ""+Suits.I_DIAMONDS;
            case Suits.HEARTS: return ""+Suits.I_HEARTS;
            default: return ""+Suits.I_SPADES;
        }
    }

    public String getRank() {
        return ""+rank.getRank();
    }

    public String getStringNotation() {
        return this.stringNotation;
    }

    public String getHandNotation() {
        return this.handNotation;
    }

    public String getPokerNotation() {
        return this.pokerNotation;
    }
}
