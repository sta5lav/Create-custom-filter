package org.example;


import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Object[] obj = new Object[]{1, 2, "three", "four"};
        System.out.println(Arrays.toString(filter(obj, new FilterImpl())));
        System.out.println("*********************" + "  outputInfo for example " + "*********************");

        System.out.println(arrayToMap(new String[]{"one", "one", "two", "four"}));
        Integer[] inter = new Integer[]{1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 7};
        System.out.println(arrayToMap(inter));

    }

    //2 практическое задание в коллекциях
    public static <T> Map<? extends Object, ? extends Number> arrayToMap(T[] array) {
        List<T> elements = List.of(array);

        //1 Способ
        Set<T> uniqueElements = new HashSet<>(List.of(array));
        Map<? super Object, Integer> result = new HashMap<>();
        for (T u : uniqueElements) {
            result.put(u, Collections.frequency(elements, u));
        }

        //2 Способ
        Map<Object, Long> map = elements.
                stream().
                collect(
                        Collectors.groupingBy(n -> n, Collectors.counting())
                );
        return map;
    }

    //1 практическое задание в коллекциях
    public static <T> T[] filter(T[] array, FilterImpl filter){
        T[] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            result[i] = (T) filter.apply(array[i]);
        }
        return result;
    }
}




