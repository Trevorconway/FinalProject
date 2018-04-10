
import java.util.ArrayList;
import java.util.List;

/**
 * Course: CS341 Data Structures Date: April 2018 Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public class Blackjack {

    public static final int BUST_VALUE = 21;

    Deck bjDeck = new Deck();

    List<Card> hand = new ArrayList<Card>();

    public void generateBlackjack() {
        hand.add(bjDeck.draw());
        hand.add(bjDeck.draw());
    }

    public void hit() {
        hand.add(bjDeck.draw());
    }

    public int getSum() {

        int sum = 0;

        for (int x = 0; x < hand.size(); x++) {
            sum += hand.get(x).getNumericalValue();
        }

        return sum;
    }

    public boolean checkBust() {

        if (getSum() > BUST_VALUE) {
            return true;
        }

        return false;
    }

    public boolean checkWinner() {

        if (getSum() > houseScore) {
            return true;
        }

        return false;
    }

}
