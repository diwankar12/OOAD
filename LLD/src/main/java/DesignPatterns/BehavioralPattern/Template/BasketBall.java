package DesignPatterns.BehavioralPattern.Template;

public class BasketBall extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("Initalizing basketball game...");
    }

    @Override
    protected void playing() {
         System.out.println("Playing basketball game...");
    }

    @Override
    protected void showResults() {
        System.out.println("Showing the results for the basketball game...");
    }
}
