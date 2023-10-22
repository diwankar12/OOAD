package DesignPatterns.BehavioralPattern.NullObjectPattern;

public class Main {
    public static void main(String[] args) {

        Vechicle bike = Vechiclefactory.getVechicleObject("Car");
        printVechicleDetails(bike);


    }

    public static void printVechicleDetails(Vechicle vechicle){
        System.out.println("Seating capacity :"+vechicle.getSeatingSpace());
        System.out.println("Tank Capacity : "+vechicle.getTankCapacity());

    }
}
