package com.java7.business;

import com.java7.movies.model.Apple;
import com.java7.movies.model.ApplePredicate;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class FilterApples {

    public List<Apple> filter(List<Apple> apples, ApplePredicate applePredicate) {

        List<Apple> appleList = new LinkedList<Apple>();

        for (Apple apple : apples) {
            if (applePredicate.test(apple)) {
                appleList.add(apple);
            }
        }
        return appleList;
    }

}
