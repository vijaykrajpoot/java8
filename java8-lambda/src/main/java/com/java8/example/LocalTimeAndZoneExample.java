package com.java8.example;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class LocalTimeAndZoneExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(22, 30);
        LocalTime badTime = LocalTime.of(22, 30);

        LocalTime morningTime = badTime.plusHours(8);
        System.out.println("Bad Time:" + badTime + " Morning Time:" + morningTime);

        Set<String> zones = ZoneId.getAvailableZoneIds();
        zones.forEach(System.out::println);

        System.out.println("ZoneId.of(\"Asia/Calcutta\"):"+ ZoneId.of("Asia/Calcutta"));


    }
}
