package arrays;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Arrays
 * This is an example class to illustrate Array Methods in Java
 */

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Ankita", "Suresh", "Deepika"};
        System.out.println("Array elements are ");
        for(String name: names ) {
            System.out.println(name);
        }
        String[] namesCopy = Arrays.copyOf(names, names.length);
        System.out.println("Copied Array elements are ");
        for(String name: namesCopy ) {
            System.out.println(name);
        }

        System.out.println("Are arrays equal " + Arrays.equals(names, namesCopy));
        Arrays.sort(names);
        System.out.println("Sorted Array elements are ");
        for(String name: names ) {
            System.out.println(name);
        }

        System.out.println("String value of array is: " + Arrays.toString(names));
    }
}
