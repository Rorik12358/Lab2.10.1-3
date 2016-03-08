package com.brainacad.oop.testexcp2_10_1and2;

/**
 * Created by R2-D2 on 08.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Lab 2.10.1:
        try {
            throw new Exception("Exception from lab 2.10.1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I was there (finally block)");
        }

        //Lab 2.10.2:
        try {
            throw new MyException("Exception from lab 2.10.2");
        } catch (MyException e) {
            e.printMessage();
        }
        MyTest myTest = new MyTest();
        try {
            myTest.test();
        } catch (MyException e) {
            e.printMessage();
        }
        finally {
            System.out.println("Finaly block of myTest");
        }
        MyTest myTestNull = null;
        try {
            myTestNull.test();
        } catch (MyException e) {
            e.printMessage();
        } finally {
            System.out.println("finally block from null object");
        }
    }
}
