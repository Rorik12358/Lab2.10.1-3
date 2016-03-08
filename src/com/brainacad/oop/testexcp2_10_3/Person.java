package com.brainacad.oop.testexcp2_10_3;

/**
 * Created by R2-D2 on 08.03.2016.
 * lab 2.10.3
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 120 || age < 1) throw new InvalidAgeException();
        this.age = age;
    }
}
