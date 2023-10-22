package DesignPatterns.BehavioralPattern.NullObjectPattern;

public class Bike implements Vechicle {
    @Override
    public int getSeatingSpace() {
         return 2 ;
    }

    @Override
    public int getTankCapacity() {
       return 500;
    }
}
