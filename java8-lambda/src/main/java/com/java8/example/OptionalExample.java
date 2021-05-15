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
        if (email1.isPresent()) {
            System.out.println("email1.get()" + email1.get());
        }

        String emailOrElse = email1.orElse("NoEmail");
        System.out.println("emailOrElse:" + emailOrElse);


        try {
            Optional<String> email = Optional.ofNullable(person.getEmail());
            email.orElseThrow(() -> new IllegalArgumentException("Email not found"));
        } catch (Exception ex) {
            System.err.println("2.Got NPE:" + ex.getLocalizedMessage());
        }


        Optional<String> fName = Optional.ofNullable(person.getFirstName());
        fName.ifPresent(System.out::println);

        // Find person with email using method and return Optional
        try {
            String email = "vijay.kumar@gmail.com";
            Optional<Person> searchedPerson = Optional.ofNullable(PersonService.findPersonByPersonEmail(email));
            searchedPerson.ifPresent(person1 -> {
                System.out.println("Person found with email:" + email);
                System.out.println(person1);
            });
        } catch (Exception ex) {
            System.err.println("Error Occurred : " + ex.getLocalizedMessage());
        }


        try {
            String email = "vijay.rajput@gmail.com";
            Optional<Person> searchedPerson = Optional.ofNullable(PersonService.findPersonByPersonEmail("vijay.rajput@gmail.com"));
            searchedPerson.ifPresent(person1 -> {
                System.out.println("Person found with email:" + email);
                System.out.println(person1);
            });
        } catch (Exception ex) {
            System.err.println("Error Occurred : " + ex.getLocalizedMessage());
        }

    }
}
