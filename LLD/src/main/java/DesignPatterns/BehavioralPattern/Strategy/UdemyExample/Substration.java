package DesignPatterns.BehavioralPattern.Strategy.UdemyExample;

public class Substration implements Strategy {
    @Override
    public void execute(int num1, int num2) {

        System.out.println(num1-num2);
    }
}