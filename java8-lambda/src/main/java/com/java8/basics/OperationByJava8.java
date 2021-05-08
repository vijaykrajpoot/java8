package com.java8.basics;
public class OperationByJava8 {
    public int add(int a, int b) {
        Operation op = (num1, num2) -> num1 + num2;
        return op.operate(a, b);
    }

    public int subtract(int a, int b) {
        Operation op = (num1, num2) -> num1 - num2;
        return op.operate(a, b);
    }

    public int multiply(int a, int b) {
        Operation op = (num1, num2) -> num1 * num2;
        return op.operate(a, b);
    }

    public int devide(int a, int b) {
        Operation op = (num1, num2) -> {
            if (num2 == 0) {
                throw new IllegalArgumentException("denominator cannot be zero");
            }
            return num1 / num2;
        };
        return op.operate(a, b);
    }

    public static void main(String[] args) {
    	OperationByJava8 op = new OperationByJava8();
        System.out.println("    Addition(12, 12)    :" + op.add(12, 12));
        System.out.println("    Subtract(12, 12)    :" + op.subtract(12, 12));
        System.out.println("    Multiply(12, 12)    :" + op.multiply(12, 12));
        System.out.println("    Devide  (12, 12)    :" + op.devide(12, 12));
    }

}

@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}