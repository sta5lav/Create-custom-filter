package org.example;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] obj = new Object[]{1, 2, "three", "four"};
        Example example = new Example();
        System.out.println(Arrays.toString(filter(obj, example)));


    }

    public static Object[] filter(Object[] array, Example example){
        List<?> lst = Arrays.stream(array).toList();
        return lst.stream().map(example::apply).toArray();
    }
}




