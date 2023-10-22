package DesignPatterns.BehavioralPattern.Strategy.CC.Strategy;

public class SpeedDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Speed drive vrooooom");
    }
}
