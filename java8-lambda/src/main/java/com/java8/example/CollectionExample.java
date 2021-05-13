package com.java8.example;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionExample {

    public static void main(String[] args) {
        List<String> ll = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        List<String > days=new ArrayList<>(ll);
        boolean b=days.removeIf(s -> s.length() > 8);
        days.replaceAll(String::toUpperCase);
        days.sort(Comparator.naturalOrder());
        System.out.println(days.stream().collect(Collectors.joining(", ")));

    }
}
