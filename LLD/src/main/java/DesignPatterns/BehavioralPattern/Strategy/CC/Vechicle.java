package DesignPatterns.BehavioralPattern.Strategy.CC;

import DesignPatterns.BehavioralPattern.Strategy.CC.Strategy.DriveStrategy;

public class Vechicle {

    DriveStrategy driveStrategy ;

    Vechicle(DriveStrategy driveStrategy){
          this.driveStrategy=driveStrategy ;
    }

    public void drive(){
         driveStrategy.drive();
    }

}
