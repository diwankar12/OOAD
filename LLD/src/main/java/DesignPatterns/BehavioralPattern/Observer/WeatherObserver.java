package DesignPatterns.BehavioralPattern.Observer;

public class WeatherObserver implements Observer {

    private int pressure ;
    private int temperature ;
    private int humidity ;
   // private Subject subject ;

//    WeatherObserver(Subject subject){
//         this.subject=subject ;
//         this.subject.addObserver(this);
//    }
    @Override
    public void update(int pressure, int temperature, int humidity) {
          this.pressure=pressure ;
          this.humidity=humidity ;
          this.temperature = temperature;
          showData();
    }

    private void showData() {
        System.out.println("Pressure : "+this.pressure +
                 " temperature :"+this.temperature +" humidity : "+this.humidity);
    }
}
