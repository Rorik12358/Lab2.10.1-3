package com.brainacad.oop.testexcp2_10_3;

/**
 * Created by R2-D2 on 08.03.2016.
 * Lab 2.10.3
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(190);
        }
        catch (RuntimeException e){
            System.out.println("Invalid age");
        }finally {
            System.out.println("final block");
        }
        System.out.println(person.getAge());
    }
}
