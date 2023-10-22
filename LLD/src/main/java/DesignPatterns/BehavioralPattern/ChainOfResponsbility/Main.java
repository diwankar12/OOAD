package DesignPatterns.BehavioralPattern.ChainOfResponsbility;

/*
   Chain of responsibility principle - that lets you pass requests along a
   chain of handlers. Upon receiving a request,
   each handler decides either to process the request or to pass it
   to the next handler in the chain.

    Example - ATM,Vending machine ,logger frame work
 */
public class Main {
    public static void main(String[] args) {

        LoggerProcessor logger = new INFOLogProcessor(
                new DEBUGLogProcessor(
                        new ERRORLogProcessor(null)));
        logger.log(LoggerProcessor.ERROR,"exception happens");


    }
}
