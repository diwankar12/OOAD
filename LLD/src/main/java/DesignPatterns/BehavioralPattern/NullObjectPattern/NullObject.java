package DesignPatterns.BehavioralPattern.NullObjectPattern;

public class NullObject implements Vechicle {
    @Override
    public int getSeatingSpace() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}
