package codingChallenges;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Arrays
 * This is the solution for Coding Challenge related to Arrays in Java
 */

import java.util.Arrays;

public class CricketTeam {
    public static void main(String[] args) {
        String teamPlayers[] = {"Kohli", "Dhoni", "Sachin", "Sehwag", "Yuvraj"};
        System.out.println("Team players are ");
        for(String name : teamPlayers) {
            System.out.print(name + ", ");
        }
        System.out.println();
        Arrays.sort(teamPlayers);
        System.out.println("Sorted Team players are ");
        for(String name : teamPlayers) {
            System.out.print(name + ", ");
        }
    }
}
