package DesignPatterns.BehavioralPattern.Observer.StockExchange;

public class BuyStockListener implements Observer{

    @Override
    public void update(float price) {
        if(price<95){
            System.out.println("Buying stock yayy");
        }
    }
}
