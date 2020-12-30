package wrappers;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Data Types
 * This is an example class to illustrate DownCasting in Java
 */

public class DownCasting {
        public static void main(String args[]) {
            Long longValue = 34766l;

            Integer intValue = longValue.intValue();

            System.out.println("The Integer value of the Long is " + intValue);
        }
}
