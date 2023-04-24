package LLDQuestions.SnakeAndLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    private Cell[][] cells ;

    public Board(int numberOfSnakes, int numberOfLadders, int boardSize) {
           initializeCells(boardSize);
           addSnakesAndLadders(cells,numberOfSnakes,numberOfLadders);
    }

    private void initializeCells(int boardSize){
         cells = new Cell[boardSize][boardSize];
         for(int i=0;i<boardSize;i++){
             for(int j=0;j<boardSize;j++){
                 Cell obj = new Cell();
                 cells[i][j] = obj ;
             }
         }
    }

    private void addSnakesAndLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders) {

          while(numberOfSnakes>0){
              int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
              int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
              if(snakeHead>=snakeTail){
                   continue;
              }
               Jump snakeObj = new Jump(snakeHead,snakeTail);
               Cell cell = getCell(snakeHead);
               cell.setJump(snakeObj);
               numberOfSnakes--;

          }
        while(numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(ladderStart <= ladderEnd) {
                continue;
            }

            Jump ladderObj = new Jump(ladderStart,ladderEnd);

            Cell cell = getCell(ladderStart);
            cell.setJump(ladderObj);

            numberOfLadders--;
        }

    }

    public Cell getCell(int playerPosition) {
         int row = playerPosition/cells.length ;
         int col = playerPosition % cells.length ;
         return cells[row][col];
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

}
