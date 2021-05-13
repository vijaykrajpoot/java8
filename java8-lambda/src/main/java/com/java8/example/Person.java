package com.java8.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vkumar1 created on 5/11/21
 */
public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private final List<String> phoneNumbers = new ArrayList<>();

    public Person firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Person email(String email) {
        this.email = email;
        return this;
    }

    public Person lastName(String lName) {
        this.lastName = lName;
        return this;
    }

    public Person phoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
        return this;
    }

    public Person age(int age) {
        this.age = age;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
