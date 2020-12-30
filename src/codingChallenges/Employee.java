package codingChallenges;

/**
 * Kaliyona Course: Core Java Tutorial
 * Module: Classes and Objects
 * This is the solution for Coding Challenge related to Classes and Objects in Java
 */

public class Employee {

    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary){
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void printEmployeeDetails(){
        System.out.println("Employee id is " + employeeId);
        System.out.println("Employee name is " + name);
    }

    void calculateTax(){
        double tax = salary * 2 / 100;
        System.out.println("Tax of Employee " + employeeId + "is " + tax);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Jack", 112, 5000);
        emp1.printEmployeeDetails();
        emp1.calculateTax();
    }
}
