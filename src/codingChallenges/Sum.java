package codingChallenges;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: User Input
 * This is the solution for Coding Challenge related to
 * obtaining the user input in Java
 */

import java.util.Scanner;

public class Sum {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter two numbers:");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println("Sum is " + sum);
//    }

    public static void main(String[] args) {
        Integer num1 = Integer.parseInt(args[0]);
        Integer num2 = Integer.parseInt(args[1]);
        Integer sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }
}
