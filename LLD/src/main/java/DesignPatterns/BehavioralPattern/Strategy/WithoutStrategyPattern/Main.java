package DesignPatterns.BehavioralPattern.Strategy.WithoutStrategyPattern;

public class Main {

    public static void main(String[] args) {

        ImageManager imageManager = new ImageManager();
        imageManager.setRenderer(new LaptopRenderer());
        imageManager.show();
    }
}
