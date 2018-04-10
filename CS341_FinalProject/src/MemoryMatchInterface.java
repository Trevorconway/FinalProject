
/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public interface MemoryMatchInterface {

    public void generateMemoryMatch(String difficulty);

    public void easyMode();

    public void mediumMode();

    public void hardMode();

    public boolean isMatch(Card cardOne, Card cardTwo);

}
