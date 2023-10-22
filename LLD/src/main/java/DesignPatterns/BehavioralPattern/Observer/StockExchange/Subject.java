package DesignPatterns.BehavioralPattern.Observer.StockExchange;

public interface Subject {
     void notifyAllObserver();
     void addObserver(Observer o);
}
