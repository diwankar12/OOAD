package DesignPatterns.BehavioralPattern.Observer.StockExchange;

public class Main {
    public static void main(String[] args) {

      StockExchange stockExchange = new StockExchange();
      stockExchange.addObserver(new SellStockListener());
      stockExchange.addObserver(new BuyStockListener());
      stockExchange.start();

    }
}
