package DesignPatterns.CreationalDesign.AbstractFactory;

public class ElectricFord implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling an Electric ford");
    }
}
