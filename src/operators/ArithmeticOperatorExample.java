package operators;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Operators
 * This is an example class to illustrate arithmetic operators in Java
 */

public class ArithmeticOperatorExample {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("Sum is " + (num1 + num2));
        System.out.println("Difference is " + (num2 - num1));
        System.out.println("Product is " + (num1 * num2));
        System.out.println("num2 divided by num1 is " + (num2 / num1));
        System.out.println("Remainder value is " + (num2 % num1));
        System.out.println("num1 incremented value is " + (++num1));
        System.out.println("num2 decremented value is " + (--num2));
    }
}
