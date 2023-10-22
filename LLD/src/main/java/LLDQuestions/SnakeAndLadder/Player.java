package LLDQuestions.SnakeAndLadder;

public class Player {
    private int  id ;
    private int currentPosition ;

    public Player(int id, int currentPosition) {
        this.id = id;
        this.currentPosition = currentPosition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
