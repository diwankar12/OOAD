package DesignPatterns.BehavioralPattern.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver observer = new WeatherObserver(station);
        station.setHumidity(100);
        station.setPressure(500);
        station.setTemperature(300);
    }
}
