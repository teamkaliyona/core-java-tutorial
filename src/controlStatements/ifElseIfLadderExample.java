package controlStatements;
/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Conditional Statements
 * This is an example class to illustrate if-else-if ladder in Java
 */

public class ifElseIfLadderExample {
    public static void main(String[] args) {
        int studentMarks = 25;

        if(studentMarks >= 80){
            System.out.println("Distinction");
        } else if (studentMarks >= 70) {
            System.out.println("First Class");
        } else if(studentMarks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}
