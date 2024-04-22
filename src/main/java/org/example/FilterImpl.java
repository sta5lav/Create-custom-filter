package org.example;

public class FilterImpl implements Filter {

     Object apply(Object o) {
        if (o instanceof String) {
            return o;
        } else return "not string";
    }

}

