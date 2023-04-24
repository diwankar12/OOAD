package DesignPatterns.BehavioralPattern.Template;

public class Football extends Game {
    @Override
    protected void initializeGame() {
        System.out.println("Initalizing football game...");
    }

    @Override
    protected void playing() {
        System.out.println("Playing football game...");
    }

    @Override
    protected void showResults() {
        System.out.println("Showing the results for the football game...");
    }
}
