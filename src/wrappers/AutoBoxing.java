package wrappers;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Data Types
 * This is an example class to illustrate AutoBoxing in Java
 */
public class AutoBoxing {
    public static void main(String[] args) {
        int number = 66; //primitive
        Integer boxedInteger = Integer.valueOf(number);

        System.out.println("Autoboxing integer value is " + boxedInteger);

    }
}
