package strings;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Operators
 * This is an example class to illustrate String Operations in Java
 */

public class StringOperations {
    public static void main(String[] args) {
        String str1= "Kaliyona";
        String str2 = "Without Limits";
        //String str2 = "kaliyona ";

        System.out.println("Length is " + str1.length());
        System.out.println("String is empty " + str1.isEmpty());
        //System.out.println("String 2 is empty " + str2.isEmpty());
        System.out.println(str1.concat(str2));

        System.out.println("In upper case " + str1.toUpperCase());
        System.out.println("In Lower case " + str1.toLowerCase());

        System.out.println("Position of i is " + str1.indexOf("i"));
        System.out.println("Character at position 5 is " + str1.charAt(5));

        //System.out.println("Strings are equal " + str1.equals(str2));
        System.out.println("Strings are equal " + str1.equalsIgnoreCase(str2));

        System.out.println("Is String starting with Ka " + str1.star    tsWith("Ka"));
        System.out.println("Is String ending with na " + str1.endsWith("na ") );

        System.out.println("Substring is " + str1.substring(4, 6));
        System.out.println("Replaced string is " + str2.replace("Limits", "boundary"));
    }
}
