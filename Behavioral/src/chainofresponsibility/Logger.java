package chainofresponsibility;

/**
 * Created by bircumaxim on 11/18/2016.
 */
public abstract class Logger {
    protected Logger nextLogger;

    protected LogLevel logLevel;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void LogMessage(LogLevel logLevel, String message){
        if(this.logLevel  == logLevel){
            write(message);
        } else {
            nextLogger.LogMessage(logLevel, message);
        }
    }

    abstract protected void write(String message);

    public enum LogLevel {
        INFO,
        DEBUG,
        ERROR
    }

}


