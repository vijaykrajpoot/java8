package com.java8.basics;

public class SimplyAddByJava7 {

	public static void main(String[] args) {
		Addition addition = new AdditionImpl();
		System.out.println(addition.add(2, 3));
	}

}

class AdditionImpl implements Addition {
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}

interface Addition {
	int add(int a, int b);
}