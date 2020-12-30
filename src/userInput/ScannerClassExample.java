package userInput;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: User Input
 * This is an example class to illustrate usage of
 * Scanner class to get user input in Java
 */

import java.util.Scanner;

public class ScannerClassExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
    }

}
