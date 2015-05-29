package CardDeck;

/**
 * Created by Harsha on 5/29/2015.
 * Interface for a Card in the Deck.
 */
public interface ICard {

    public String getColor();

    public String getSuit();

    public String getIcon();

    public String getRank();

    public String getStringNotation();

    public String getHandNotation();

    public String getPokerNotation();

}
