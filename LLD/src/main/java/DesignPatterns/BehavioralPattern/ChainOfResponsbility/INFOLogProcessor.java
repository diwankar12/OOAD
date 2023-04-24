package DesignPatterns.BehavioralPattern.ChainOfResponsbility;

public class INFOLogProcessor extends LoggerProcessor {

    INFOLogProcessor(LoggerProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    public void log(int logLevel,String message){
            if(logLevel==INFO){
                System.out.println("INFO: "+ message);
            } else {
                super.log(logLevel,message);
            }
    }
}
