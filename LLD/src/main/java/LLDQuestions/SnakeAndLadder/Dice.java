package LLDQuestions.SnakeAndLadder;

import java.util.Random;

public class Dice {

    private int diceCount ;
    int max = 6;
    int min =1 ;

    Dice(int diceCount){
        this.diceCount = diceCount ;
    }

    public int rollDice(){

        int count = diceCount ;
        int sum = 0 ;
        Random random = new Random();
        while(count>0){
             sum+= random.nextInt(6-1) + 1 ;
             count--;
        }
       return sum ;
    }

}
