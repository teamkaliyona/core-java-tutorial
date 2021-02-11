package inheritance;

public class ContractEmployee extends Employee {
    double dayRateSalary;

    void printSalary(){
        System.out.println("Employee salary per day is " + dayRateSalary);
    }

    public static void main(String[] args) {
        ContractEmployee emp1 = new ContractEmployee();
        emp1.empId = 101;
        emp1.name = "Rahul";
        emp1.dayRateSalary = 2000;

        emp1.printEmployeeDetails();
        emp1.printSalary();
    }
}
