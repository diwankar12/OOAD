package DesignPatterns.BehavioralPattern.Iterator;

public class NameRepository {
    private String[] names = {"sheeba","cluso","dobu"} ;
    public Iterator getIterator(){
        return new NameIterator(names);
    }
}
