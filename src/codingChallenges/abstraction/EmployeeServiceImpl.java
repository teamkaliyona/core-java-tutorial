package codingChallenges.abstraction;

public class EmployeeServiceImpl implements EmployeeService {

    public void printDetails(Employee emp) {
        System.out.println("Employee id is " + emp.getEmpId());
        System.out.println("Employee name is " + emp.getName());
        System.out.println("Employee salary is " + emp.getSalary());
    }

    public void calculateTax(double salary) {
        double tax = salary * 5 / 100;
        System.out.println("Tax amount is " + tax);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Ankita");
        emp.setSalary(8000);

        EmployeeService empService = new EmployeeServiceImpl();
        empService.printDetails(emp);
        empService.calculateTax(emp.getSalary());
    }
}
