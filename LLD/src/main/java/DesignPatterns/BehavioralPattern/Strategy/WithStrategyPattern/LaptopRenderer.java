package DesignPatterns.BehavioralPattern.Strategy.WithStrategyPattern;

public class LaptopRenderer implements Renderer {

    @Override
    public void show() {
        System.out.println("Showing an image on laptop...");
    }
}
