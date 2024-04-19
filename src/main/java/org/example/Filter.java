package org.example;

public interface Filter {

    default Object apply(Object o) {
        if (o instanceof String) {
            return o;
        } else return "not string";
    }
}
