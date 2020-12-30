package operators;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Operators
 * This is an example class to illustrate logical operators in Java
 */

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 30;

        System.out.println("Result of AND is " + (num1 > 10 && num1 < 80 && num2 < 20));
        System.out.println("Result of OR is " + (num1 < 10 || num1 > 50));
        System.out.println("Result of NOT is " + !(num1 > 10));
    }
}
