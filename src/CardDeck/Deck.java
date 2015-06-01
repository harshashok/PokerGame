package CardDeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by Harsha on 5/31/2015.
 */
public class Deck implements IDeck {

    private ArrayList<Card> cardDeck;
    private int count;
    private Stack<Card> pile;
    private boolean shuffled;

    Deck() {

        cardDeck = new ArrayList<>();

            //TODO: build deck.
        for (char s : Suits.getAllSuitsArray()){
            for(char r : Ranks.getRanksArray()){
                System.out.print(r + "" + s + " ");
                cardDeck.add(new Card(new Rank(r), new Suit(s)));
            }
        }
        System.out.println();

        count = cardDeck.size();
        pile = new Stack<>();
        shuffled = false;
    }

    Deck(int shuffle){

        this();
        if(shuffle == 1){
            Collections.shuffle(cardDeck);
            shuffled = true;
        }
    }


    @Override
    public Card drawTopCard() throws Exception {

        if(cardDeck.isEmpty() && count > 0){
            return null;
        }
        else {
            count -= 1;
            return cardDeck.remove(0);

        }

    }

    @Override
    public void shuffleDeck() {
            Collections.shuffle(cardDeck);
            shuffled = true;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void discard(Card card) {
        pile.push(card);
    }
}
