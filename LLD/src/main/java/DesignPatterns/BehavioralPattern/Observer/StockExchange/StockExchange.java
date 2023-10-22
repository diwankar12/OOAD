package DesignPatterns.BehavioralPattern.Observer.StockExchange;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Objective : design observer pattern where to buy ,
// if the price of a stock is less than 95 and
// sell if it is more than 105

public class StockExchange  implements Subject{

    private float price =100 ;
    private Random random ;
    List<Observer> observerList ;

    StockExchange(){
        random = new Random();
        observerList = new ArrayList<>();
    }

    public void start(){
         while(true){
              try{
                  Thread.sleep(500);
              }catch (InterruptedException ex){
                  ex.printStackTrace();
              }
              price += 2*random.nextFloat()-1;
             notifyAllObserver();
             System.out.println(price);

         }
    }

    @Override
    public void notifyAllObserver() {

              for(Observer o:observerList){
                    o.update(this.price);
              }

    }
    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

}
