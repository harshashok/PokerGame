package test;

import CardDeck.Rank;
import CardDeck.Ranks;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Harsha on 5/29/2015.
 */
public class RankTest {

    @Test
    public void testRankDefault() {

        Rank rank = new Rank();
        Assert.assertEquals(rank.getRank(), 'A', "Message!");
    }

    @Test
    public void testRankAssigned() {

        Rank rank1 = new Rank(Ranks.KING);
        Rank rank2 = new Rank(Ranks.JACK);
        Rank rank3 = new Rank(Ranks.TEN);
        Rank rank4 = new Rank(Ranks.EIGHT);
        Rank rank5 = new Rank('C');

        Assert.assertEquals(rank1.getRank(), Ranks.KING, "Error in constructor assigning ranks!");
        Assert.assertEquals(rank2.getRank(), Ranks.JACK, "Error in constructor assigning ranks!");
        Assert.assertEquals(rank3.getRank(), Ranks.TEN, "Error in constructor assigning ranks!");
        Assert.assertEquals(rank4.getRank(), Ranks.EIGHT, "Error in constructor assigning ranks!");
        Assert.assertNotSame(rank5.getRank(), 'C', "Error in constructor assigning ranks!");


    }

}
