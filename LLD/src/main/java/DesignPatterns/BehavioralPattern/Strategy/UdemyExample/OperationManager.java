package DesignPatterns.BehavioralPattern.Strategy.UdemyExample;

public class OperationManager {
    Strategy strategy ;

    OperationManager(Strategy strategy){
        this.strategy = strategy ;
    }

    public void execute(int num1,int num2){
         this.strategy.execute(num1,num2);
    }
}
