
/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Deck {
    
    public Queue<Card> deckOfCards = new LinkedList<Card>();

    public static Queue<Card> makeDeck(Queue<Card> deckOfCards) {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values()) {
                deckOfCards.add(new Card(value, suit, null));
            }
        }
        return deckOfCards;
    }

    public Deck() {
        deckOfCards = makeDeck(deckOfCards);
    }
    
    public Queue<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(Queue<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    @Override
    public String toString() {
        return "Deck of cards: " + deckOfCards;
    }

    public void shuffleDeck() {
        Collections.shuffle((List<Card>) deckOfCards);
    }
    
    public void moveToBottom(Card newBottom) {
        deckOfCards.add(newBottom);
        
    }
    
    public Card draw(){
        return deckOfCards.remove();
    }

}
