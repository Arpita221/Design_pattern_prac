package Chain;

public class ChainOfResponsibilityDemo { private static Logger getChainOfLoggers() {
    Logger errorLogger = new ErrorLogger(Logger.ERROR);
    Logger debugLogger = new DebugLogger(Logger.DEBUG);
    Logger infoLogger = new InfoLogger(Logger.INFO);

    // Building the chain
    errorLogger.setNextLogger(debugLogger);
    debugLogger.setNextLogger(infoLogger);

    return errorLogger;
}

    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();

        // Test the chain with different levels
        System.out.println("Sending INFO level message:");
        loggerChain.logMessage(Logger.INFO, "This is an info level message.");

        System.out.println("\nSending DEBUG level message:");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug level message.");

        System.out.println("\nSending ERROR level message:");
        loggerChain.logMessage(Logger.ERROR, "This is an error level message.");
    }
}
