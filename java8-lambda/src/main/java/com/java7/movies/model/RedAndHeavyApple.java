package com.java7.movies.model;

public class RedAndHeavyApple implements ApplePredicate {



    @Override
    public boolean test(Apple apple) {
        if(apple==null){
            return false;
        }
        return apple.getColor().equalsIgnoreCase("red") && apple.getWeight()>150;
    }
}
