package com.java8.example;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(22, 30);
        LocalTime badTime = LocalTime.of(22, 30);

        LocalTime morningTime = badTime.plusHours(8);
        System.out.println("Bad Time:" + badTime + " Morning Time:" + morningTime);


    }
}
