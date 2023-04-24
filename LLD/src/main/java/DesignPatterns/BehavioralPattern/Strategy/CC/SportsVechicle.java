package DesignPatterns.BehavioralPattern.Strategy.CC;

import DesignPatterns.BehavioralPattern.Strategy.CC.Strategy.DriveStrategy;
import DesignPatterns.BehavioralPattern.Strategy.CC.Strategy.SpeedDriveStrategy;

public class SportsVechicle extends Vechicle {


    SportsVechicle() {
        super(new SpeedDriveStrategy());
    }
}
