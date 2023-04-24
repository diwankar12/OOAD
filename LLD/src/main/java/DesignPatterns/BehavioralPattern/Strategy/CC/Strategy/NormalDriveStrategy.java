package DesignPatterns.BehavioralPattern.Strategy.CC.Strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }
}
