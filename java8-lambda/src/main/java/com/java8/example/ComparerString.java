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
            if (str1.length() > str2.length())
                return 1;
            else if (str1.length() < str2.length())
                return -1;
            else
                return 0;
        };

        List<String> lst = Arrays.asList("*****", "**", "*", "****", "***");
        lst.sort(comparatorLambda);

        for (String s : lst) {
            System.out.println(s);
        }


    }

}
