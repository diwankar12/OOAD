package DesignPatterns.BehavioralPattern.Strategy.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        ImageManager imageManager = new ImageManager(new LaptopRenderer());
        imageManager.show();
        ImageManager tv = new ImageManager(new TVrenderer());
        tv.show();


    }
}
