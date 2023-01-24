package org.example.domain;

import java.util.Objects;

public class Customer {

    private String firstName;

    private String lastName;

    private final String VAT_NUMBER;


    public Customer(String firstName, String lastName, String VAT_NUMBER) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.VAT_NUMBER = VAT_NUMBER;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getVAT_NUMBER() {
        return VAT_NUMBER;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(firstName, customer.firstName)
                && Objects.equals(lastName, customer.lastName)
                && Objects.equals(VAT_NUMBER, customer.VAT_NUMBER);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, VAT_NUMBER);
    }


    @Override
    public String toString() {
        return "Customer: " +
                "\nfirstName: " + firstName +
                "\nlastName: " + lastName +
                "\nVAT_NUMBER: " + VAT_NUMBER;
    }
}
