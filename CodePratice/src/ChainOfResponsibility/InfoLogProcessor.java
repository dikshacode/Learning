package ChainOfResponsibility;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public  void log(int loglevel, String message){
        if(loglevel == LogProcessor.INFO){
            System.out.println(message);
        }
        else {
            super.log(loglevel,message);
        }
    }
}
