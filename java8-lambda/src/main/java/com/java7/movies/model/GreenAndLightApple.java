package com.java7.movies.model;

public class GreenAndLightApple implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        if(apple==null){
            return false;
        }
        return apple.getColor().equalsIgnoreCase("green") && apple.getWeight()<150;
    }
}
