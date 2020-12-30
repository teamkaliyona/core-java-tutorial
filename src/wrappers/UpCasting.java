package wrappers;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Data Types
 * This is an example class to illustrate UpCasting in Java
 */

public class UpCasting {
    public static void main (String args[]) {
        Integer intValue = 45;
        Long longValue = Long.valueOf(intValue);


        System.out.println("The Long value of the Integer is " + longValue);
    }
}
