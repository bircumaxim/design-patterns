package chainofresponsibility;


import chainofresponsibility.loggers.ConsoleLogger;
import chainofresponsibility.loggers.ErrorLogger;
import chainofresponsibility.loggers.FileLogger;

/**
 * Created by bircumaxim on 11/18/2016.
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerBuilder(new ErrorLogger(Logger.LogLevel.ERROR))
                .appendNextLogger(new FileLogger(Logger.LogLevel.DEBUG))
                .appendNextLogger(new ConsoleLogger(Logger.LogLevel.INFO))
                .build();

        logger.LogMessage(Logger.LogLevel.INFO,"information level");
        logger.LogMessage(Logger.LogLevel.DEBUG,"debug level");
        logger.LogMessage(Logger.LogLevel.ERROR,"error level");
    }
}
