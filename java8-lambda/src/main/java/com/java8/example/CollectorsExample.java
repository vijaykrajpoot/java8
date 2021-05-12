package com.java8.example;

import java.util.List;
import java.util.stream.Collectors;

public class Collectors {

    public static void main(String[] args) {
        List<Customer> customers = CustomerService.all();
        String name =
                customers.stream()
                        .map(Customer::getFirstName)
                        .collect(Collectors.joining(","));
    }
}
