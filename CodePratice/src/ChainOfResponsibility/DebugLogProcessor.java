package ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public  void log(int loglevel, String message){
        if(loglevel == LogProcessor.DEBUG){
            System.out.println(message);
        }
        else {
            super.log(loglevel,message);
        }
    }
}
