package DesignPatterns.BehavioralPattern.ChainOfResponsbility;

public class DEBUGLogProcessor extends LoggerProcessor {

    DEBUGLogProcessor(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel==DEBUG){
            System.out.println("DEBUG: "+ message);
        } else {
            super.log(logLevel,message);
        }
    }
}
