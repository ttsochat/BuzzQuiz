import java.util.ArrayList;

/**
 * This class is the parent of the game types that are available.
 * It has an int that refers to the points that need to be added to the winner and it also has
 * a variable to save the winner of the round.
 */

public abstract class Type {
    ArrayList<Player> players;

    public Type(){
        // empty construstor

    }

    public Type(ArrayList<Player> players) {
        this.players = players;

    }

    public abstract void  changePoints();

    public void SetPlayersList(ArrayList<Player> players){
        this.players = players;
    }

    private void runTimeError() {
        //κλαση που δεν φτιαχνει αντικείμενο???
        //void?
    }

}
