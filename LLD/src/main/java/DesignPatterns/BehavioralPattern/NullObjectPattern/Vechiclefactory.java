package DesignPatterns.BehavioralPattern.NullObjectPattern;

public class Vechiclefactory {

    Vechicle vechicle ;
    static Vechicle getVechicleObject(String type){
          if(type.equals("Bike")){
              return new Bike();
          }

          return new NullObject();
    }
}
