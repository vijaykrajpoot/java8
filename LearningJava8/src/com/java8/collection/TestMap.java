package com.java8.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	
	public static void main(String[] args) {
		
		Map<String, String> items= new HashMap<String, String>();
		items.put("key1", "value1");
		items.put("key2", "value2");
		items.put("key3", "value3");
		items.put("key4", "value4");
		items.put("key5", "value5");
	
		// Non - Java8
		for(Map.Entry<String, String> entry:items.entrySet()){
			System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
		}
		// Java8
		System.out.println("===========");
		items.forEach((k,v)->System.out.println (k+"-"+v));
		System.out.println("===========");
		items.forEach((k,v)->{
			System.out.println (k+"-"+v);
		});
		
		
	}

}
