package com.java8.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author vkumar1 created on 5/11/21
 */
public class PersonService {

    public static List<Person> getAllPerson() {
        return Stream.of(
                new Person().firstName("Vijay").age(23).lastName("Rajput").email("vijay.rajput@gmail.com").phoneNumber("4084667618"),
                new Person().firstName("Ajay").age(25).lastName("Rajput").email("ajay.rajput@hotmail.com").phoneNumber("2547896145"),
                new Person().firstName("Kamal").age(43).lastName("Rajput").email("kamal.rajput@gmail.com").phoneNumber("2354859874"),
                new Person().firstName("Amit").age(43).lastName("Garg").email("amit.garg@gmail.com").phoneNumber("8758968521"),
                new Person().firstName("Prakash").age(45).lastName("Ratna").email("prakash.ratna@gmail.com").phoneNumber("5874632541"),
                new Person().firstName("Jack").age(45).lastName("Ryan").email("prakash.ratna@gmail.com").phoneNumber("5874632541"),
                new Person().firstName("Shashank").age(50).lastName("Arora").email("Shashank.arora@gmail.com").phoneNumber("368974512"),
                new Person().firstName("Vicky").age(45).lastName("Garg").email("vickey.garg@gmail.com").phoneNumber("9856231478"),
                new Person().firstName("Pavan").age(45).lastName("Saxena").email("vickey.garg@gmail.com").phoneNumber("9856231478"),
                new Person().firstName("Jd").age(51).lastName("B").email("jd@yahoo.com").phoneNumber("6582145796")


        ).collect(Collectors.toList());
    }

    public static Person findPersonByPersonEmail(String email) {
        return getAllPerson()
                .stream()
                .filter(person -> person.getEmail().equalsIgnoreCase(email))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Person with email: '" + email + "' not found"));
    }


    public static List<Person> getEmployeeSortedByLastName() {
        return getAllPerson()
                .stream()
                .sorted((o1, o2) -> {
                    return o1.getEmail().compareTo(o2.getEmail());
                }).collect(Collectors.toList());

    }


}
