package ChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));

        logger.log(LogProcessor.INFO, "Hi Info");
        logger.log(LogProcessor.DEBUG, "Hi Debug");
        logger.log(LogProcessor.ERROR, "Hi Error");
    }
}
