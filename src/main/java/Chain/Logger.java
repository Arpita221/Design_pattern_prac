package Chain;

abstract class Logger {


    protected int level;
    protected Logger nextLogger;

    // Set the next logger in the chain
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    // Abstract method to be implemented by concrete loggers
    protected abstract void write(String message);
}
