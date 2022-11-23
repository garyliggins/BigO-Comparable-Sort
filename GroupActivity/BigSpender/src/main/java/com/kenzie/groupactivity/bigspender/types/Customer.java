package com.kenzie.groupactivity.bigspender.types;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Represents a customer who uses AWS.
 */
public class Customer implements Comparable<Customer>{
    private String name;
    private LocalDate joinDate;

    /**
     * Constructor creating an AWS customer.
     * @param name The unique name of the customer.
     * @param joinDate The Data that the customer joined.
     */
    public Customer(String name, LocalDate joinDate) {
        this.name = name;
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "name='" + name + '\'' +
            ", joinDate=" + joinDate +
            '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(joinDate, customer.joinDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, joinDate);
    }

    @Override
    public int compareTo(Customer other) {
        int result = this.name.compareTo(other.name);
        if (result != 0) {
            return result;
        }
        return this.joinDate.compareTo(other.joinDate);
    }
}
