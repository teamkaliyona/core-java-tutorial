package collections.comparable;

public class Employee implements Comparable<Employee>{

    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(){

    }

    @Override
    public int compareTo(Employee emp){
        return emp.id - this.id;
    }

    @Override
    public String toString(){
        return this.id + " : " + this.name;
    }
}
