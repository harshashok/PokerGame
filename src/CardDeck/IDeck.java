package CardDeck;

/**
 * Created by Harsha on 5/31/2015.
 */
public interface IDeck {

    public Card drawTopCard() throws Exception;

    public void shuffleDeck();

    public int  getCount();

    public void discard(Card card);

}
