package codingChallenges;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Operators
 * This is the solution for Coding Challenge related to Operators in Java
 */

public class AverageMarks {
    public static void main(String[] args) {
        int sub1 = 80;
        int sub2 = 20;
        int avg = (sub1 + sub2) / 2;
        System.out.println("Average marks is " + avg);
        String result = (avg > 40) ? "Pass" : "Fail";
        System.out.println("Result is " + result);
        String dist = (sub1 >=70 && sub2 >=70) ? "Distinction" : "First Class";
        System.out.println("Final result is " + dist);
    }
}
