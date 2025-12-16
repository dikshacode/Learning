package ChainOfResponsibility;

public class Test {
    public static void main(String[] args){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(1,"::INFO::");
        logProcessor.log(2,"::DEBUG::");
        logProcessor.log(3,"::EROR::");

    }
}
