package com.java8.collection;

import java.util.Arrays;
import java.util.List;


public class TestList {
	
	public static void main(String[] args) {
		
		String arrFruits[]={"Banana","Mango","Grapes","Apple","Pear"};
		List<String> fruits=Arrays.asList(arrFruits);
		
		// Regular loop
		for (String fruit : fruits) {
			System.out.print(fruit+" ");
		}
		
		
		
	}

}
