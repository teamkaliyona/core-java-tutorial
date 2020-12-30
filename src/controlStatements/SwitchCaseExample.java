package controlStatements;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Conditional Statements
 * This is an example class to illustrate switch statement in Java
 */

public class SwitchCaseExample {
    public static void main(String[] args) {
        String grade = "F";
        switch(grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Average");
                break;
            case "C":
                System.out.println("Can do better");
                break;
            case "D":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
