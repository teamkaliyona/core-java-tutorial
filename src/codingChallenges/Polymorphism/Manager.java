package codingChallenges.Polymorphism;

public class Manager extends Employee {

    void calculateTax(double salary) {
        double tax = salary * 5 / 100;
        System.out.println("Tax amount for Managers is " + tax);
    }

    public static void main(String[] args) {
        Manager man1 = new Manager();
        man1.calculateTax(5000);

        Employee emp1 = new Employee();
        emp1.calculateTax(2000);
    }
}
