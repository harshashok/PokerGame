package test;

import CardDeck.Card;
import org.testng.Reporter;
import org.testng.annotations.Test;
import sun.text.normalizer.UTF16;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Created by Harsha on 5/31/2015.
 */
public class CardTest {


    @Test
    public void testCardDefault(){

        Card card = new Card();

       System.out.println(card.getColor()+"  "+card.getIcon().toString()+" ? "+card.getSuit());
        Reporter.log(card.getColor() + "  " + card.getIcon().toString() + " ? " + card.getSuit(), true);

    }
}
