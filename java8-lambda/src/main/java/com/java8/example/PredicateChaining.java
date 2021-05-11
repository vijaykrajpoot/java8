package com.java8.example;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author vkumar1 created on 5/10/21
 */
public class PredicateChaining {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("one", "two", "three", "four", "five","six","seven","eight","nine","ten");
        Predicate<String> p1 = s -> s.length() > 3;
        Predicate<String> p2 = s -> s.endsWith("n");
        stringStream
                .filter(p1.or(p2))
                .forEach(System.out::println);
    }

}
