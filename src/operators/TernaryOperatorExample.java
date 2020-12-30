package operators;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Operators
 * This is an example class to illustrate ternary operators in Java
 */

public class TernaryOperatorExample {
    public static void main(String[] args) {
        int number = -65;
        //booleanExpression ? value 1 :value 2;
        String message = number > 0 ? "Number is positive" : "Number is negative";
        System.out.println(message);
    }
}
