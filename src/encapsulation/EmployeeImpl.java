package encapsulation;

public class EmployeeImpl {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Rahul");
        emp.setSalary(5000);

        System.out.println("Employee id is " + emp.getEmpId());
        System.out.println("Employee name is " + emp.getName());
        System.out.println("Employee salary is " + emp.getSalary());
    }
}
