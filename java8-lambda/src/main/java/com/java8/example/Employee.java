package com.java8.example;

/**
 * @author vkumar1 created on 5/11/21
 */
public class Employee {
    private int id;
    private String name;
    private String grade;
    private double salary;

    public Employee id(int id) {
        this.id = id;
        return this;
    }

    public Employee name(String name) {
        this.name = name;
        return this;
    }

    public Employee grade(String grade) {
        this.grade = grade;
        return this;
    }

    public Employee salary(double salary) {
        this.salary = salary;
        return this;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", salary=" + salary +
                '}';
    }
}
