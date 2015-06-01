package CardDeck;

/**
 * Created by Harsha on 5/29/2015.
 */
public class Ranks {

    private static final String allRanks = "23456789TJQKA";
    private static final char[] ranksArray = allRanks.toCharArray();


    public static final char ACE = 'A';
    public static final char KING = 'K';
    public static final char QUEEN = 'Q';
    public static final char JACK = 'J';
    public static final char TEN = 'T';
    public static final char NINE = '9';
    public static final char EIGHT = '8';
    public static final char SEVEN = '7';
    public static final char SIX = '6';
    public static final char FIVE = '5';
    public static final char FOUR = '4';
    public static final char THREE = '3';
    public static final char TWO = '2';


    public static String getRanksString() {
        return Ranks.allRanks;
    }


    public static char[] getRanksArray() {
        return Ranks.ranksArray;
    }

}
