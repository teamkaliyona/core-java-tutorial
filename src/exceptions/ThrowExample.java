package exceptions;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the day of the month");
            int day = input.nextInt();
            if (day < 1 || day > 31) {
                throw new ArithmeticException("Invalid Day");
            }
        } catch(ArithmeticException exp){
            System.out.println(exp.getLocalizedMessage());
            System.out.println("Please enter only valid day");
        }
    }

}
