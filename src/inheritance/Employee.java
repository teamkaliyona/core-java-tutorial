package inheritance;

public class Employee {
    public int empId;
    public String name;

    Employee(){
        empId = 101;
        name = "Deepak";
    }

    void printEmployeeDetails(){
        System.out.println("Employee id is " + empId);
        System.out.println("Employee name is " + name);
    }
}
