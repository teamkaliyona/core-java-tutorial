package codingChallenges.collections;

public class Employee implements Comparable<Employee>{

    int id;
    String name;
    String department;
    double salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee(){

    }

    @Override
    public int compareTo(Employee emp){
        return this.id - emp.id;
    }

    @Override
    public String toString(){
        return this.id + " " + this.name;
    }

}
