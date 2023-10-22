package DesignPatterns.BehavioralPattern.Observer;

public interface Subject {
     void addObserver(Observer o) ;
     void removeObserver(Observer o) ;
     void notifyAllObservers();

}
