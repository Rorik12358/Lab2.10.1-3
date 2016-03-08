package com.brainacad.oop.testexcp2_10_3;

/**
 * Created by R2-D2 on 08.03.2016.
 */
public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
    public InvalidAgeException() {
    }
}
