package dataTypes;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Data Types
 * This is an example class to illustrate creation of Variables in Java
 */

public class VariableClass {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        System.out.println("num1 is " + num1);
        System.out.println("num2 is " + num2);
        System.out.println("Sum is " + (num1 + num2));
        System.out.println("Product is " + (num1 * num2));

        num1 = 6;
        System.out.println("Sum is " + (num1 + num2));
        System.out.println("Product is " + (num1 * num2));
    }
}
