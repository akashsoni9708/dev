package com.openapi.dev.model;

import javax.persistence.*;


@Entity
@Table(name = "USERREGISTRATION")
public class UserRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customerid", nullable = false)
    private int customerId;
    @Column
    private String firstName;
    @Column
    private String lastName;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    @Column
    private String place;
    @Column
    private int age;
    @Column
    private String Date;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPlace() {
        return place;
    }

    public int getAge() {
        return age;
    }

    public String getDate() {
        return Date;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDate(String date) {
        Date = date;
    }
}
