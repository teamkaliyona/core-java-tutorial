package loopingStatements;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Looping Statements
 * This is an example class to illustrate for-each loop in Java
 */

public class ForEachExample {
    public static void main(String[] args) {
        for(String name : args){
            System.out.println("Hello " + name);
        }
    }
}
