package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Object[] obj = new Object[]{1, 2, "three", "four"};
        Example example = new Example();
        System.out.println(Arrays.toString(filter(obj, example)));


    }

    public static Object[] filter(Object[] array, Example example){
        List<?> lst = Arrays.stream(array).toList();
        lst.stream().map(s -> example.apply(array));
        return lst.toArray();
        /*for (int i = 0; i < newArray.length; i++) {
            newArray[i] = example.apply(array[i]);
        }
        return newArray;*/

    }
}




