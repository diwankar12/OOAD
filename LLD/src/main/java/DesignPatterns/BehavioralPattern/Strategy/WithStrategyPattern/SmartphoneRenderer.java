package DesignPatterns.BehavioralPattern.Strategy.WithStrategyPattern;

public class SmartphoneRenderer implements Renderer {

    @Override
    public void show() {
        System.out.println("Showing an image on smartphone...");
    }
}
