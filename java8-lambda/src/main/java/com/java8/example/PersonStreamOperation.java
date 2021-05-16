package com.java8.example;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author vkumar1 created on 5/11/21
 */
public class PersonStreamOperation {

    public static void main(String[] args) {

        List<Person> persons = PersonService.getAllPerson();
        // Collect all the email.
        Predicate<Person> emailPredicate = email -> email.getEmail().endsWith("gmail.com");
        List<String> emails = persons
                .stream()
                .filter(emailPredicate)
                .map(Person::getEmail)
                .collect(Collectors.toList());
        emails.forEach(System.out::println);
        System.out.println("______________________________________________________________");
        // Get all the Person sorted by their last name
        List<Person> personList = persons.stream()
                .sorted((p1, p2) -> {
                    return p1.getLastName().compareTo(p2.getLastName());
                })
                .collect(Collectors.toList())
                .stream()
                .sorted((p1, p2) -> {
                    return p1.getFirstName().compareTo(p2.getFirstName());
                })
                .collect(Collectors.toList());
        personList.forEach(System.out::println);
    }
}
