package controlStatements;

import java.util.Scanner;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Conditional Statements
 * This is an example class to illustrate nested-if in Java
 */

public class NestedIfExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if(num >= 0) {
            if(num % 2 == 0){
                System.out.println("It is a even number");
            } else {
                System.out.println("It is a odd number");
            }
        } else{
            System.out.println("It is a negative number");
        }
    }
}
