package com.java8.example;

import java.util.*;
import java.util.stream.*;

public class CollectorsExample {

    public static void main(String[] args) {
        List<Person> persons = PersonService.all();
        String name =
                persons.stream()
                        .map(customer -> {
                            return customer.getFirstName().toLowerCase(Locale.ROOT) + " " + customer.getLastName().toLowerCase();
                        })
                        .collect(Collectors.joining(", "));
        System.out.println(name);

        // Collector example with groupBy
        Map<Integer, List<Person>> collect = persons.stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println("collect:" + collect);

        // Collector example with groupBy number of people of age
        Map<Integer, Long> count = persons.stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
        System.out.println("count:" + count);


        // Find min age person
        Optional<Person> minAge = persons.stream().min(Comparator.comparing(Person::getAge));
        System.out.println(minAge);
        // Find min age person
        Optional<Person> maxAge = persons.stream().max(Comparator.comparing(Person::getAge));
        System.out.println(maxAge);

        // Collector example with groupBy
        Map<Integer, List<String>> collectP = persons.stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.mapping(
                                Person::getFirstName,
                                Collectors.toList())));
        System.out.println("collect:" + collectP);

        // Collector example with groupBy
        Map<Integer, Set<String>> sorted = persons.stream()
                .filter(person -> person.getAge() > 20)
                .collect(Collectors.groupingBy(
                        Person::getAge,
                        Collectors.mapping(
                                Person::getFirstName,
                                Collectors.toCollection(TreeSet::new))));
        System.out.println("sorted:" + sorted);

    }
}
