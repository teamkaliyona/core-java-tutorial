package codingChallenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionChallenge {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the student age");
            int age = input.nextInt();
            if (age < 18 || age > 100) {
                throw new ArithmeticException("Access Denied");
            }
        }catch(InputMismatchException | ArithmeticException exp){
            System.out.println(exp.getMessage());
            System.out.println("Please enter a valid age");
        }
    }

}
