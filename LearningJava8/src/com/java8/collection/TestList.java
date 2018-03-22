package com.java8.collection;

import java.util.Arrays;
import java.util.List;


public class TestList {
	
	public static void main(String[] args) {
		
		String arrFruits[]={"Banana","Mango","Grapes","Apple","Pear"};
		List<String> fruits=Arrays.asList(arrFruits);
		
		// Regular loop
		System.out.println("=====>REGULAR- LOOP");
		for (String fruit : fruits) {
			System.out.print(fruit+" ");
		}
		// Java8
		System.out.println("\n=====>JAVA8- LOOP");
		fruits.forEach(fruit->System.out.print(fruit+" "));
		System.out.println("");
		// Iterate and Convert to upper case
		fruits.forEach(fruit->{
			fruit=fruit.toUpperCase();
			System.out.print(fruit+" ");
		});
	}

}
