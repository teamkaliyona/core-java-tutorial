package codingChallenges;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Conditional Statements
 * This is the solution for Coding Challenge related to conditional statements in Java
 */

import java.util.Scanner;

public class TrafficLights {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the colour of traffic light");
        String color = input.nextLine();
        /*if(color.equalsIgnoreCase("Red")){
            System.out.println("Stop");
        } else if(color.equalsIgnoreCase("Yellow")) {
            System.out.println("Get Ready");
        } else if(color.equalsIgnoreCase("Green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid traffic signal");
        } */

        switch (color) {
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Get Ready");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid traffic signal");
        }
    }
}
