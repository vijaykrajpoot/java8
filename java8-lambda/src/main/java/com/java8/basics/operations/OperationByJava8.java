package com.java8.basics.operations;

public class OperationByJava8 {

	public static void main(String[] args) {
		OperationLambda lambda = new OperationLambda();
		System.out.println("	Addition(12, 12)	:" + lambda.doOperate(lambda.add, 12, 12));
		System.out.println("	Subtract(12, 12)	:" + lambda.doOperate(lambda.substract, 12, 12));
		System.out.println("	Multiply(12, 12)	:" + lambda.doOperate(lambda.multiply, 12, 12));
		System.out.println("	Devide	(12, 12)	:" + lambda.doOperate(lambda.divide, 12, 12));
	}

}