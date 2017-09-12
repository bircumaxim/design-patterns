package com.company.Loggers;

import com.company.Logger;

/**
 * Created by bircumaxim on 11/18/2016.
 */
public class ConsoleLogger extends Logger {

    public ConsoleLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
