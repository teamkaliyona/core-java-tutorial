package codingChallenges.Polymorphism;

public class Employee {

    void calculateTax(double salary) {
        double tax = salary * 2 / 100;
        System.out.println("Tax amount is " + tax);
    }
}
