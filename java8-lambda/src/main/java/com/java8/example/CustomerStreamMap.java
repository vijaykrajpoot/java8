package com.java8.example;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author vkumar1 created on 5/11/21
 */
public class CustomerStreamMap {

    public static void main(String[] args) {

        List<Customer> customers = CustomerService.all();
        Predicate<Customer> emailPredicate=email->email.getEmail().endsWith("gmail.com");
        List<String> emails = customers.stream().filter(emailPredicate).map(Customer::getEmail).collect(Collectors.toList());
        emails.forEach(System.out::println);


    }

}
