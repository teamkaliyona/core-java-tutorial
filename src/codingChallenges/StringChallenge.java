package codingChallenges;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Data Types
 * This is the solution for Coding Challenge related to Strings in Java
 */

public class StringChallenge {
    public static void main(String[] args) {
        String firstName = "Aishwarya Rai";
        String lastName = " Bachchan";
        firstName.su

        System.out.println("Full name is " + firstName.concat(lastName).toUpperCase());
        System.out.println("Middle name is " + firstName.substring(10));
        System.out.println("Replaced name is "
                + firstName.replace("Aishwarya", "Aaradhya")
                .concat(lastName));
    }

}
