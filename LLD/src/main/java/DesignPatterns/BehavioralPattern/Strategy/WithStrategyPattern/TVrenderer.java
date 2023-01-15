package DesignPatterns.BehavioralPattern.Strategy.WithStrategyPattern;

public class TVrenderer implements Renderer {

    @Override
    public void show() {
        System.out.println("Showing an image on TV...");
    }
}
