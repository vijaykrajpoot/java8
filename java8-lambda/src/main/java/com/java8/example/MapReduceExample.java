package com.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;

/**
 * @author vkumar1 created on 5/11/21
 */
public class MapReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Integer Mapper
        int sum1 = numbers.stream().mapToInt(value -> value).sum();
        System.out.println("sum1:" + sum1);

        // Reduce with binary Operator
        int sum2 = numbers.stream().reduce(0, (a, b) -> (a + b));
        System.out.println("sum2:" + sum2);

        // Explicit Binary Operator
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        int sum3 = numbers.stream().reduce(0, binaryOperator);
        System.out.println("sum3:" + sum3);
        // Method reference
        int sum4 = numbers.stream().reduce(0, Integer::sum);
        System.out.println("sum4:" + sum4);

        int multiplicationResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("multiplicationResult:" + multiplicationResult);
        // Compare
        int findMax = numbers.stream().reduce(0, (Integer a, Integer b) -> {
            if (a > b)
                return a;
            else
                return b;
        });
        System.out.println("findMax:" + findMax);
        // findMaxMethodRef
        int findMaxMethodRef = numbers.stream().reduce(Integer::max).get();
        System.out.println("findMaxMethodRef:" + findMaxMethodRef);


        List<String> strings = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");

        String longestString = strings.stream().reduce((s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            } else {
                return s2;
            }
        }).get();

        System.out.println("longestString:" + longestString);

        // Employee service example


        List<Employee> employees = EmployeeService.getAllEmployee();
        // Get Stream
        // Filter employee via grade
        // Get The salary ==> Map the salary
        OptionalDouble salary = employees.stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(sal -> sal)
                .average();
        System.out.println("AverageSalary:" + salary);
        // Highest SalariedEmployee
        // Get Stream
        // Filter employee via grade
        // Get The salary ==> Map the salary
        Optional<Employee> employee = employees.stream()
                .reduce((employee1, employee2) -> {
                    if (employee1.getSalary() > employee2.getSalary())
                        return employee1;
                    else
                        return employee2;
                });
        System.out.println("Highest Salaried Employee:" + employee.get());


        // Sum of Salary of all grade A employee
        // Get Stream
        // Filter employee via grade
        // Get The salary ==> Map the salary
        double sumOfSalary = employees.stream()
                .filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(s -> s)
                .sum();
        System.out.println("sumOfSalary:" + sumOfSalary);


    }
}
