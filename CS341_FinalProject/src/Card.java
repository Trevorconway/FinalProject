
/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public class Card {

    //enums
    public static enum Suit {
        HEARTS, SPADES, DIAMONDS, CLUBS;
    }

    public static enum Value {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
    }

    public static enum FaceUp {
        TRUE, FALSE;
    }

    //data members
    private final Value value;
    private final Suit suit;
    private FaceUp faceUp;

    public Card(Value value, Suit suit, FaceUp faceUp) {
        this.value = value;
        this.suit = suit;
        this.faceUp = faceUp;
    }

    public Value getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public FaceUp getFaceUp() {
        return faceUp;
    }

    public void setFaceUp(FaceUp faceUp) {
        this.faceUp = faceUp;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }

    public int getNumericalValue() {

        int numberValue = 0;

        switch (this.value) {
            case ACE:
                numberValue = 1;
                break;
            case TWO:
                numberValue = 2;
                break;
            case THREE:
                numberValue = 3;
                break;
            case FOUR:
                numberValue = 4;
                break;
            case FIVE:
                numberValue = 5;
                break;
            case SIX:
                numberValue = 6;
                break;
            case SEVEN:
                numberValue = 7;
                break;
            case EIGHT:
                numberValue = 8;
                break;
            case NINE:
                numberValue = 9;
                break;
            case TEN:
                numberValue = 10;
                break;
            case JACK:
                numberValue = 10;
                break;
            case QUEEN:
                numberValue = 10;
                break;
            case KING:
                numberValue = 10;
                break;
        }//end switch
        
        return numberValue;
        
    }//end getNumericalValue

}
