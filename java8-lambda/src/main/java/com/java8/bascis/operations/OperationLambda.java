package com.java8.bascis.operations;

public class OperationLambda {
	// Lambda definitions
	public Operation add = (num1, num2) -> {
		return num1 + num2;
	};

	public Operation substract = (num1, num2) -> {
		return num1 - num2;
	};

	public Operation multiply = (num1, num2) -> {
		return num1 * num2;
	};

	public Operation divide = (num1, num2) -> {
		if (num2 == 0) {
			throw new IllegalArgumentException("denominator cannot be zero");
		}
		return num1 / num2;
	};

	int doOperate(Operation op, int a, int b) {
		return op.operate(a, b);
	}

}

@FunctionalInterface
interface Operation {
	int operate(int a, int b);
}