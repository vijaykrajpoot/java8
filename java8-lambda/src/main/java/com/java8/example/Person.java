package com.java8.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vkumar1 created on 5/11/21
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private final List<String> phoneNumbers = new ArrayList<>();

    public Customer firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Customer email(String email) {
        this.email = email;
        return this;
    }

    public Customer LastName(String lName) {
        this.lastName = lName;
        return this;
    }

    public Customer phoneNumber(String phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
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

    @Override
    public String toString() {
        return "Customer{" +
                "fName='" + firstName + '\'' +
                ", lName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
