package codingChallenges;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Looping Statements
 * This is the solution for Coding Challenge related to For Loop in Java
 */

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 30 are ");

        for(int i=1; i <= 30; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
