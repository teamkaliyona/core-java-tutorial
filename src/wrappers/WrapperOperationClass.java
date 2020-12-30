package wrappers;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Data Types
 * This is an example class to illustrate Type Conversion in Java
 */

public class WrapperOperationClass {
    public static void main(String[] args) {
        Integer num1 = 50;
        Long num2 = 67843L;

        //Integer sum = num1 + num2;
        Long sum = Long.valueOf(num1) + num2;
        System.out.println("Sum is " + sum);
    }

}
