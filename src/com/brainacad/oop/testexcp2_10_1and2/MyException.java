package com.brainacad.oop.testexcp2_10_1and2;

/**
 * Created by R2-D2 on 08.03.2016.
 */
public class MyException extends Exception {
    String message;

    public MyException(String message) {
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message);
    }
}
