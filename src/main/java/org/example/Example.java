package org.example;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class Example implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }

    Object apply(Object o){
        return o;
    }
}

