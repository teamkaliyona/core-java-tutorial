package wrappers;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Data Types
 * This is an example class to illustrate UnBoxing in Java
 */
public class UnBoxing {
    public static void main(String[] args) {
        Long number = 345l;
        long longValue = number.longValue();

        System.out.println("Unboxing Long value is " + longValue);
    }
}
