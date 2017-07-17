package chainofresponsibility.loggers;

import chainofresponsibility.Logger;

/**
 * Created by bircumaxim on 11/18/2016.
 */
public class FileLogger extends Logger {

    public FileLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger" + message);
    }
}
