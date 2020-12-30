package classExample;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Classes and Objects
 * This is an example class to illustrate Creation of Methods in Java
 */

public class Sum {

    public int addingTwoNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Sum obj = new Sum();
        int result = obj.addingTwoNumbers(10, 5);
        System.out.println("Sum is " + result);
        int result2 = obj.addingTwoNumbers(20,40);
        System.out.println("Second sum is " + result2);
    }
}
