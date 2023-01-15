package DesignPatterns.BehavioralPattern.Strategy.UdemyExample;

public class Main {
    public static void main(String[] args) {
        OperationManager operationManager =
                new OperationManager(new Addition());
        operationManager.execute(10,5);
        OperationManager operationManager2 =
                new OperationManager(new Multiplication());
        operationManager2.execute(10,5);
    }
}
