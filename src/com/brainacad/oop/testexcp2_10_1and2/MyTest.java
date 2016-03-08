package com.brainacad.oop.testexcp2_10_1and2;

/**
 * Created by R2-D2 on 08.03.2016.
 */
public class MyTest {
    public void test() throws MyException {
        throw new MyException("MyException from MyTest object method test");
    }
}
