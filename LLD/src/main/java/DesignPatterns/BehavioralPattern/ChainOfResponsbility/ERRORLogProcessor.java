package DesignPatterns.BehavioralPattern.ChainOfResponsbility;



public class ERRORLogProcessor extends LoggerProcessor {

    ERRORLogProcessor(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel==ERROR){
            System.out.println("ERROR: "+ message);
        } else {
            super.log(logLevel,message);
        }
    }
}
