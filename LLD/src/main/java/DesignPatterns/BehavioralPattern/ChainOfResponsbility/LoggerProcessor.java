package DesignPatterns.BehavioralPattern.ChainOfResponsbility;

public abstract class LoggerProcessor {

    public static int INFO =1 ;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LoggerProcessor loggerProcessor ;
    LoggerProcessor(LoggerProcessor loggerProcessor){
        this.loggerProcessor = loggerProcessor ;
    }

    public void log(int logLevel,String message){
        if(loggerProcessor!=null){
             loggerProcessor.log(logLevel,message);
        }
    }

}
