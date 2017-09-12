package com.company.Loggers;

import com.company.Logger;

/**
 * Created by bircumaxim on 11/18/2016.
 */
public class ErrorLogger extends Logger {

    public ErrorLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
