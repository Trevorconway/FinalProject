
/**
 * Course: CS341 Data Structures
 * Date: April 2018
 * Assignment: CS341_FinalProject
 * Authors: Trevor Conway, Tristin Harvell, Travis Kruse, Johnny Tran
 */
public class Player {

    //data members
    private String username;
    private int funds;

    public Player() {
    }

    public Player(String username, int funds) {
        this.username = username;
        this.funds = funds;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    @Override
    public String toString() {
        return username + ": " + funds;
    }
    
    //generate user and funds file
    
    //update user and funds file
    
    //generate user and scores file
    
    //update user and funds file

}
