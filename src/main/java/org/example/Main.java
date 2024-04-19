package org.example;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] obj = new Object[]{1, 2, "three", "four"};
        System.out.println(Arrays.toString(filter(obj, new FilterImpl())));

    }

    public static Object[] filter(Object[] array, Filter filter){
        List<?> lst = Arrays.stream(array).toList();
        return lst.stream().map(filter::apply).toArray();
    }
}




