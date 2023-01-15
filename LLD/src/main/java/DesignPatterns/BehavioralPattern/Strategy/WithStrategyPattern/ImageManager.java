package DesignPatterns.BehavioralPattern.Strategy.WithStrategyPattern;

import DesignPatterns.BehavioralPattern.Strategy.WithoutStrategyPattern.LaptopRenderer;
import DesignPatterns.BehavioralPattern.Strategy.WithoutStrategyPattern.SmartphoneRenderer;
import DesignPatterns.BehavioralPattern.Strategy.WithoutStrategyPattern.TVrenderer;

public class ImageManager {

    private Renderer renderer ;

    ImageManager(Renderer renderer){
        this.renderer = renderer ;
    }

    public void show(){
       this.renderer.show();
    }
}
