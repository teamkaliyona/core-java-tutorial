package codingChallenges.collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionCodingChallenge {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(102, "Rama", "IT", 5000));
        empList.add(new Employee(104, "Shama", "HR", 15000));
        empList.add(new Employee(101, "Bama", "Finance", 12000));
        empList.add(new Employee(103, "Raj", "Testing", 11000));

        Collections.sort(empList);

        Iterator<Employee> itr = empList.iterator();

        while (itr.hasNext()){
            Employee emp = itr.next();
            if(emp.getSalary() > 10000){
                System.out.println("Tax amount for " + emp.getName() + " is " + (emp.getSalary() * 5 / 100));
            } else {
                System.out.println("No tax for " + emp.getName());
            }
        }
    }

}
