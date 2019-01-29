package com.java7.business;

import com.java7.movies.model.Apple;
import com.java7.movies.model.GreenAndHeavyApple;
import com.java7.movies.model.GreenAndLightApple;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class FilterAppleTest {

    public static void main(String[] args) {
        List<Apple> apples= makeApple();

        FilterApples filterApples=new FilterApples();
        List<Apple> greenLightWeightApple=filterApples.filter(apples,new GreenAndHeavyApple());
        System.out.println("greenLightWeightApple:"+greenLightWeightApple.size());
    }


    static List<Apple> makeApple() {
        List<Apple> apples = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            Random random = new Random(10);
            if (random.nextInt() % 5 == 0) {
                apples.add(new Apple("red", 200));
            }
            if (random.nextInt() % 2 == 0) {
                apples.add(new Apple("green", 100));
            }

            System.out.println(i +":" + apples.get(i));
        }

        System.out.println("apples.size():=>>"+apples.size());
        return apples;
    }

}
