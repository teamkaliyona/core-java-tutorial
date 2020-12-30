package codingChallenges;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Looping Statements
 * This is the solution for Coding Challenge related to While Loop in Java
 */

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(50);

        System.out.println("Please enter the number ");
        int userInput = input.nextInt();

        while(userInput != randomNumber){
            if(userInput > randomNumber){
                System.out.println("Random number is lesser than " + userInput);
            } else {
                System.out.println("Random number is greater than " + userInput);
            }
            System.out.println("Guess the number again");
            userInput = input.nextInt();
        }
        System.out.println("Congratulations, you have guessed the right number " + randomNumber);
    }
}
