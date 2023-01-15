package DesignPatterns.BehavioralPattern.Strategy.WithoutStrategyPattern;

public class ImageManager {

    private Object renderer ;

    public void setRenderer(Object renderer){
        this.renderer = renderer ;
    }

    public void show(){

        if(renderer instanceof TVrenderer){
               TVrenderer tVrenderer = (TVrenderer) renderer ;
               tVrenderer.showImage();
        } else if(renderer instanceof LaptopRenderer) {
            LaptopRenderer tvRenderer = (LaptopRenderer) renderer;
            tvRenderer.showImage();
        } else if(renderer instanceof SmartphoneRenderer) {
            SmartphoneRenderer tvRenderer = (SmartphoneRenderer) renderer;
            tvRenderer.showImage();
        }
    }
}
