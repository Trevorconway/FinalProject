
import java.util.ArrayList;
import java.util.List;

/**
 * Course: CS341 Data Structures Date: April 2018 Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public class MemoryMatch {

    List<Card> original = new ArrayList<Card>();
    List<Card> copy = new ArrayList<Card>();

    String difficulty;

    public void generateMemoryMatch(String difficulty) {

        switch (difficulty) {
            case "easy":
                easyMode();
                break;
            case "medium":
                break;
            case "hard":
                break;

        }
    }

    //four cards
    public void easyMode() {
        original.add(new Card(Card.Value.ACE, Card.Suit.CLUBS, Card.FaceUp.TRUE));
        original.add(new Card(Card.Value.TWO, Card.Suit.HEARTS, Card.FaceUp.TRUE));

        copy = original;
    }

    //six cards
    public void mediumMode() {
        original.add(new Card(Card.Value.ACE, Card.Suit.CLUBS, Card.FaceUp.TRUE));
        original.add(new Card(Card.Value.TWO, Card.Suit.HEARTS, Card.FaceUp.TRUE));
        original.add(new Card(Card.Value.THREE, Card.Suit.DIAMONDS, Card.FaceUp.TRUE));

        copy = original;
    }

    //eight cards
    public void hardMode() {
        original.add(new Card(Card.Value.ACE, Card.Suit.CLUBS, Card.FaceUp.TRUE));
        original.add(new Card(Card.Value.TWO, Card.Suit.HEARTS, Card.FaceUp.TRUE));
        original.add(new Card(Card.Value.THREE, Card.Suit.DIAMONDS, Card.FaceUp.TRUE));
        original.add(new Card(Card.Value.FOUR, Card.Suit.SPADES, Card.FaceUp.TRUE));

        copy = original;
    }

    public boolean isMatch(Card cardOne, Card cardTwo) {
        if (cardOne.getSuit().equals(cardTwo.getSuit())) {
            if (cardOne.getValue().equals(cardTwo.getValue())) {
                return true;
            }
        }
        return false;
    }

}
