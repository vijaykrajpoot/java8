package com.java8.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author vkumar1 created on 5/11/21
 */
public class EmployeeService {

    public static List<Employee> getAllEmployee(){
            return Stream.of(
                    new Employee().id(100).name("vijay").grade("A").salary(200000),
                    new Employee().id(101).name("ajay").grade("B").salary(805478),
                    new Employee().id(103).name("john").grade("B").salary(548792),
                    new Employee().id(104).name("Robert").grade("D").salary(205795),
                    new Employee().id(105).name("Sandeep").grade("A").salary(569874),
                    new Employee().id(106).name("Kamal").grade("D").salary(258963),
                    new Employee().id(107).name("Amit").grade("A").salary(147852),
                    new Employee().id(108).name("Kim").grade("C").salary(874512),
                    new Employee().id(109).name("joshep").grade("A").salary(546113),
                    new Employee().id(110).name("john").grade("D").salary(798456)
            ).collect(Collectors.toList());
    }

}
