package com.java8.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author vkumar1 created on 5/11/21
 */
public class CustomerService {

    public static List<Customer> all() {
        return Stream.of(
                new Customer().firstName("vijay").LastName("Rajput").email("vijay.rajput@gmail.com").phoneNumber("4084667618"),
                new Customer().firstName("ajay").LastName("Rajput").email("ajay.rajput@hotmail.com").phoneNumber("2547896145"),
                new Customer().firstName("kamal").LastName("Rajput").email("kamal.rajput@gmail.com").phoneNumber("2354859874"),
                new Customer().firstName("Amit").LastName("Garg").email("amit.garg@gmail.com").phoneNumber("8758968521"),
                new Customer().firstName("Prakash").LastName("Ratna").email("prakash.ratna@gmail.com").phoneNumber("5874632541"),
                new Customer().firstName("Shashank").LastName("Arora").email("Shashank.arora@gmail.com").phoneNumber("368974512"),
                new Customer().firstName("vicky").LastName("Garg").email("vickey.garg@gmail.com").phoneNumber("9856231478"),
                new Customer().firstName("jd").LastName("B").email("jd@yahoo.com").phoneNumber("6582145796")


        ).collect(Collectors.toList());
    }

    ;

}
