package com.java8.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author vkumar1 created on 5/8/21
 */
public class ChainConsumer {

    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");
        List<String> newNumberList = new ArrayList<>();

        Consumer<String> consumer1 = System.out::println;
        Consumer<String> consumer2 = newNumberList::add;

        numbers.forEach(consumer1.andThen(consumer2).andThen(consumer2));

        System.out.println("-------------------");
        System.out.println("newNumberList.size:" + newNumberList.size());
        newNumberList.forEach(System.out::println);

    }
}
