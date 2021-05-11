package com.java8.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> l2 = Arrays.asList(8, 9, 10, 11);
        List<Integer> l3 = Arrays.asList(12, 13);

        List<List<Integer>> lists = Arrays.asList(l1, l2, l3);
        System.out.println(lists);
        Function<List<Integer>, Integer> fSize = List::size;


        lists.stream().map(fSize)
                .forEach(System.out::println);
        System.out.println("Map Stream ..................");
        lists.stream().map(ll->ll.stream())
                .forEach(System.out::println);

        System.out.println("FlatMap..................");
        Function<List<Integer>, Stream<Integer>> flatMapper = ll -> ll.stream();

        lists.stream()
                .flatMap(flatMapper)
                .forEach(System.out::println);

    }
}
