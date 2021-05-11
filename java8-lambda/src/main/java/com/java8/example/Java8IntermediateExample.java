package com.java8.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Java8IntermediateExample {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");

        List<String> newList = new ArrayList<>();
        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("five");

        numbers.stream()
                .peek(System.out::println)
                .filter(p1.or(p2))
                .peek(newList::add);
        System.out.println("Done............");
        System.out.println("NewList Size:" + newList.size());

        numbers.stream()
                .peek(System.out::println)
                .filter(p1.or(p2))
                .forEach(newList::add);
        System.out.println("Done............");
        System.out.println("NewList Size:" + newList.size());
    }
}
