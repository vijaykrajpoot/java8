package com.java8.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateAndTimeExample {

    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1981, Month.NOVEMBER, 4);
        Period period = dob.until(LocalDate.now());
        System.out.println("#Years:" + period.getYears());
        long noOfDays = dob.until(LocalDate.now(), ChronoUnit.DAYS);
        System.out.println("#Days:" + noOfDays);

        Period period1 = Period.between(dob, LocalDate.now());

        System.out.println("I was born " + period1.get(ChronoUnit.YEARS) + " years before!");
        System.out.println("I was born "
                + period1.get(ChronoUnit.YEARS) + " years "
                + period1.get(ChronoUnit.MONTHS) + " months "
                + period1.get(ChronoUnit.DAYS) + " days"
                + " before!");

    }
}
