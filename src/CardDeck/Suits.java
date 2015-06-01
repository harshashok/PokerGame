package CardDeck;

/**
 * Created by Harsha on 5/29/2015.
 */
public class Suits {

    private static final String allSuits = "SDCH";
    private static final char[] allSuitsArray = allSuits.toCharArray();


    public static final char CLUBS = 'C';
    public static final char DIAMOND = 'D';
    public static final char HEARTS = 'H';
    public static final char SPADES = 'S';

    public static final char RED = 'R';
    public static final char BLACK = 'B';

    public static final char I_CLUBS = '?';
    public static final char I_DIAMONDS = '?';
    public static final char I_HEARTS = '?';
    public static final char I_SPADES = '?';



    public static String getAllSuits() {
        return Suits.allSuits;
    }

    public static char[] getAllSuitsArray() {
        return Suits.allSuitsArray;
        }

}
