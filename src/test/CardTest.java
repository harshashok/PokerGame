package test;

import CardDeck.*;
import org.testng.Reporter;
import org.testng.annotations.Test;
import sun.text.normalizer.UTF16;


/**
 * Created by Harsha on 5/31/2015.
 */
public class CardTest {


    @Test
    public void testCardDefault(){

        Card card = new Card();

        System.out.println(card.getColor() + "  " + card.getIcon().toString() + "  " + card.getSuit());
        Reporter.log(card.getColor() + "  " + card.getIcon().toString() + "  " + card.getSuit(), true);
    }

    @Test
    public void testAllSuits() {

        Card cardA = new Card(new Rank(Ranks.KING), new Suit(Suits.DIAMOND));
        Card cardB = new Card(new Rank(Ranks.QUEEN), new Suit(Suits.HEARTS));
        Card cardC = new Card(new Rank(Ranks.EIGHT), new Suit(Suits.CLUBS));
        Card cardD = new Card(new Rank(Ranks.FIVE), new Suit(Suits.SPADES));


        System.out.println(cardA.getColor() + "  " + cardA.getIcon() + "  " + cardA.getSuit() + " " + cardA.getRank());
        System.out.println(cardB.getColor() + "  " + cardB.getIcon() + "  " + cardB.getSuit()+ " " + cardB.getRank());
        System.out.println(cardC.getColor() + "  " + cardC.getIcon() + "  " + cardC.getSuit()+ " " + cardC.getRank());
        System.out.println(cardD.getColor() + "  " + cardD.getIcon() + "  " + cardD.getSuit()+ " " + cardD.getRank());
    }
}
