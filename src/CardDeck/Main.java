package CardDeck;


import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * Created by Harsha on 5/31/2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Card card = new Card(new Rank('6'), new Suit('D'));

        PrintStream out = new PrintStream(System.out, true, "UTF-8");

       /* System.out.println("Suit color : "+card.getColor());
        System.out.println("Card Rank : "+card.getRank());
        System.out.println("card Suit : "+card.getSuit());
        System.out.println("card symbol : "+card.getPokerNotation());
        System.out.println("card hand : "+ card.getHandNotation());
*/
        Deck deck = new Deck();
        deck.shuffleDeck();
        Card c = deck.drawTopCard();
        System.out.println(" notation "+c.getHandNotation());
        System.out.println(deck.getCount());

        System.out.println(deck.drawTopCard().getHandNotation());
        System.out.println(deck.drawTopCard().getHandNotation());
        System.out.println(deck.drawTopCard().getHandNotation());
        System.out.println(deck.drawTopCard().getStringNotation());
        System.out.println(deck.drawTopCard().getHandNotation());
        System.out.println(deck.drawTopCard().getHandNotation());
        System.out.println(deck.drawTopCard().getHandNotation());
        System.out.println(deck.getCount());
        System.out.println(deck.drawTopCard().getStringNotation());
        System.out.println(deck.drawTopCard().getStringNotation());
        System.out.println(deck.drawTopCard().getStringNotation());
        System.out.println(deck.drawTopCard().getStringNotation());
        System.out.println(deck.drawTopCard().getStringNotation());

    }

}
