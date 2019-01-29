package com.java8.bascis;

public class Display {

	public static void main(String[] args) {
		
		DisplayByJava7 byJava7=new DisplayByJava7();
		byJava7.displayHello();

		DisplayIntf df = () -> System.out.println("This is print via Lambda exp");
		df.m1();
		
		DisplayIntf df1 = () -> System.out.println("This is print via Lambda exp again");
		df1.m1();

	}

}

class DisplayByJava7 {

	public void displayHello() {
		System.out.println("This is print via JAVA7");
	}

}

interface DisplayIntf {
	void m1();
}