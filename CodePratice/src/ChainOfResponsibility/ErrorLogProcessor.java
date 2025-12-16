package ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    public void log(int loglevel, String message){

        if(loglevel == LogProcessor.ERROR){
            System.out.println(message);
        }
        else {
            super.log(loglevel,message);
        }
    }
}
