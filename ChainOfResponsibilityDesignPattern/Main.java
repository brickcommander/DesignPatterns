package ChainOfResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new ErrorLogProcessor(new InfoLogProcessor(new DebugLogProcessor(null)));

        logger.log(LogProcessor.INFO, "Hi Info");
        logger.log(LogProcessor.DEBUG, "Hi Debug");
        logger.log(LogProcessor.ERROR, "Hi Error");
    }
}
