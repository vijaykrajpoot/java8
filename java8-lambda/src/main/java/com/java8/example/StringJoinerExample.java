package com.java8.example;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("vijay").add("ajay").add("kamal");
        System.out.println(stringJoiner);


        StringJoiner stringJoiner1 = new StringJoiner(",");
        stringJoiner1.add("Vicky");
        stringJoiner1.merge(stringJoiner);
        System.out.println(stringJoiner1);

        StringJoiner str = new StringJoiner(",", "[", "]");
        str.add("Vijay");
        System.out.println(str);
        str.add("Ajay").add("Kamal");
        System.out.println(str);


        String s=String.join("/", Arrays.asList("Vijay","Ajay","Kamal"));
        System.out.println(s);
    }
}
