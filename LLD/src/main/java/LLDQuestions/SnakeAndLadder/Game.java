package LLDQuestions.SnakeAndLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board ;
    private Dice dice ;
    Deque<Player> players = new LinkedList<>();
    Player winner ;

    public Game(){
         initialize();
    }

    private void initialize() {

        board = new Board(5,4,10);
        dice = new Dice(1);
        winner = null ;
        addPlayers();
    }

    private void addPlayers() {
          Player player1 = new Player(1,0);
          Player player2 = new Player(2,0);
          players.add(player1);
          players.add(player2);

    }

    public void startGame(){
          while(winner==null){
              Player playerTurn = findPlayerTurn();
              System.out.println("player turn is "+playerTurn.getId() + " current position is "+playerTurn.getCurrentPosition());

              int diceNumbers = dice.rollDice();

              int playerNewPosition = playerTurn.getCurrentPosition()+diceNumbers ;
              playerNewPosition = jumpCheck(playerNewPosition);
              playerTurn.setCurrentPosition(playerNewPosition);
              System.out.println("player turn is "+playerTurn.getId() + " new position is "+playerNewPosition);
              if(playerNewPosition >= board.getCells().length * board.getCells().length-1){
                   winner = playerTurn ;
              }

          }
        System.out.println("Winner is "+winner.getId());
    }

    private int jumpCheck(int playerNewPosition) {
        if(playerNewPosition > board.getCells().length * board.getCells().length-1 ){
            return playerNewPosition;
        }

        Cell cell = board.getCell(playerNewPosition);
        if(cell.getJump()!=null){
            String jumpBy = cell.getJump().getStart() < cell.getJump().getEnd() ? "ladder" :"snake" ;
            System.out.println("jump done by "+jumpBy);
            return cell.getJump().getEnd() ;
        }
        return playerNewPosition ;
    }

    private Player findPlayerTurn() {
         Player player = players.removeFirst();
         players.addLast(player);
         return player ;
    }


}
