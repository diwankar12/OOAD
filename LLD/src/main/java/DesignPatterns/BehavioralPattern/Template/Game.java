package DesignPatterns.BehavioralPattern.Template;

public abstract class Game {

    protected  abstract  void initializeGame() ;
    protected  abstract  void playing();
    protected  abstract  void showResults();
    final void play(){
         initializeGame();
         playing();
         showResults();
    }

}
