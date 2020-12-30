package controlStatements;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Conditional Statements
 * This is an example class to illustrate if-else in Java
 */

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter day of the week");
        String day = input.nextLine();
        if(day.equalsIgnoreCase("Sunday")
                || day.equalsIgnoreCase("Saturday")){
            System.out.println("It is a weekend");
        } else {
            System.out.println("It is a weekday");
        }
    }
}
