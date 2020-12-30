package arrays;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Arrays
 * This is an example class to illustrate Arrays in Java
 */

public class ArrayIntroExample {
    public static void main(String[] args) {
        int numberArray[] = {10,20,30,40,50,60};

        System.out.println("Length of array is " + numberArray.length);

        /*for(int i=0; i< numberArray.length; i++){
            System.out.println(numberArray[i]);
        } */

        for(int num : numberArray) {
            System.out.println(num);
        }

        String names[] = {"Rahul", "Ankita", "Suresh", "Deepak"};
        for(String name : names) {
            System.out.println("Hello " + name);
        }
    }
}
