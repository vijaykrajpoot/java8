package com.java8.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateAdjusterExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        LocalDate nextSunday = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("nextSunday:" + nextSunday);
        LocalDate next = now.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
        System.out.println(next);
    }
}
