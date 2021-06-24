package collections;

import java.util.HashMap;
import java.util.Map;


public class MapInterfaceExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<Integer, String>();

        System.out.println("Is Map empty: " + students.isEmpty());

        students.put(101, "Rahul");
        students.put(102, "Ankita");
        students.put(103, "Deepak");
        students.put(104, "John");

        System.out.println("Is Map empty: " + students.isEmpty());

        for(Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Student name for id 102 is " + students.get(102));

        System.out.println("Is key 103 exists: " + students.containsKey(103));

        System.out.println("Is Raj exists: " + students.containsValue("Raj"));

        students.remove(103);

        for(Map.Entry<Integer, String> entry : students.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

}
