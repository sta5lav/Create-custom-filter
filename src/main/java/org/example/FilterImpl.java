package org.example;

public class FilterImpl implements Filter {


    @Override
    public Object apply(Object o) {
        if (o instanceof String) {
            return o;
        }
        return "not string";
    }
}

