package inheritance;

public class PermanentEmployee extends Employee {
    double salary;

    void printEmployeeDetails(){
        super.printEmployeeDetails();
        this.printSalary();
        //System.out.println("Salary is " + salary);
    }

    void printSalary(){
        System.out.println("Salary is " + salary);
    }

    PermanentEmployee(){
        super();
        this.salary = 1000;
    }

    PermanentEmployee(int empId, String name){
        super.empId = empId;
        super.name = name;
    }

    PermanentEmployee(double salary) {
        this.salary = salary;
    }

    PermanentEmployee(int empId, String name, double salary) {
        this(salary);
        super.empId = empId;
        super.name = name;
    }

    public static void main(String[] args) {
        PermanentEmployee emp1 = new PermanentEmployee();
        //emp1.salary = 1000;
        emp1. printEmployeeDetails();

        PermanentEmployee emp2 = new PermanentEmployee(102, "Ramya");
        emp2.salary = 4000;
        emp2.printEmployeeDetails();
    }
}
