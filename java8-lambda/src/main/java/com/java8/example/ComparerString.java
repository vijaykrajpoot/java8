package com.java8.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author vkumar1 created on 5/8/21
 */
public class ComparerString {

    public static void main(String[] args) {


        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                if (str1.length() > str2.length())
                    return 1;
                else if (str1.length() < str2.length())
                    return -1;
                else
                    return 0;
            }
        };

        Comparator<String> comparatorLambda = (String str1, String str2) -> {
            return Integer.compare(str1.length(), str2.length());
        };

        List<String> lst = Arrays.asList("*****", "**", "*", "****", "***");
        // lst.sort(comparatorLambda);
        //lst.sort(comparator);
        lst.sort((st1, st2) -> Integer.compare(st1.length(), st2.length()));
        lst.sort((s1, s2) -> {
            if (s1.length() > s2.length())
                return 1;
            else if (s1.length() < s2.length())
                return -1;
            else
                return 0;
        });

        for (String s : lst) {
            System.out.println(s);
        }


    }

}
