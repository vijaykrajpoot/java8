package com.java8.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> l2 = Arrays.asList(8, 9, 10, 11);
        List<Integer> l3 = Arrays.asList(12, 13);

        List<List<Integer>> lists = Arrays.asList(l1, l2, l3);
        System.out.println(lists);
//        Function<List<Integer>, Integer> fSize =  ll -> {
//            ll.forEach(integer -> {
//                  integer=integer*2;
//            });
//            return
//        };


        lists.stream().map(ll -> ll.isEmpty())
                .forEach(System.out::println);
        System.out.println("Map Stream ..................");
        lists.stream().map(ll -> ll.stream())
                .forEach(System.out::println);
        // Flat map
        System.out.println("FlatMap..................");
        Function<List<Integer>, Stream<Integer>> flatMapper = ll -> ll.stream();

        lists.stream()
                .flatMap(flatMapper)
                .forEach(System.out::println);
        // SortMaps

        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("seven", 7);
        map.put("nine", 9);

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        System.out.println("________________________________");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);


        Map<Person, String> personMap = new HashMap<>();
        PersonService.getAllPerson().forEach(person -> {
            personMap.put(person, person.getEmail());
        });

        System.out.println(personMap);

        personMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Person::getLastName)))
                .forEach(System.out::println);
        
    }
}
