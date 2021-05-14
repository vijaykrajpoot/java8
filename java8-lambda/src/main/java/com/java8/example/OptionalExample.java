package com.java8.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Person person = new Person().firstName("Vijay").lastName("Rajput").age(40).phoneNumber("329740283").phoneNumber("9484983920");


        // Optional Empty
        System.out.println("1.Optional.empty():" + Optional.empty());
        // Optional Of
        // Throws NPE because it check if value is nullable
        try {
            Optional<String> email = Optional.of(person.getEmail());
        } catch (Exception ex) {
            System.err.println("2.Got NPE:" + ex.getLocalizedMessage());
        }
        // Optional ofNullable
        Optional<String> email1 = Optional.ofNullable(person.getEmail());
        System.out.println("3.email1" + email1);
        Optional<String> fName = Optional.ofNullable(person.getFirstName());
        fName.ifPresent(System.out::println);

    }
}
