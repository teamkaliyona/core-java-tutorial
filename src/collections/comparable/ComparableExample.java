package collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(3, "Amar"));
        empList.add(new Employee(1, "Akbar"));
        empList.add(new Employee(2, "Antony"));

        Collections.sort(empList);

        System.out.println(empList.toString());
    }

}
