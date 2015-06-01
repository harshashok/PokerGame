package CardDeck;

/**
 * Created by Harsha on 5/29/2015.
 */
public class Rank {

    final private char rank;

    public Rank() {
        this.rank = Ranks.ACE;
    }

    public Rank(char rank) {

        if (Ranks.getRanksString().indexOf(rank) != -1)
            this.rank = rank;
        else
            this.rank = Ranks.ACE;
    }

    public char getRank() {
        return this.rank;
    }
}
