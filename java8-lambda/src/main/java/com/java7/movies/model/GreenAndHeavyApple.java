package com.java7.movies.model;

public class GreenAndHeavyApple implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        if(apple==null){
            return false;
        }
        return apple.getColor().equalsIgnoreCase("green") && apple.getWeight()>150;
    }
}
