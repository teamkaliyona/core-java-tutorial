package collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();

        names.add("Rahul");
        names.add("Ankita");
        names.add("Raj");
        names.add("Rani");

        //print size
        System.out.println("Size of arraylist is " + names.size());

        System.out.println("Element at second position is " + names.get(1));

        System.out.println("Printing all elements");
        for(String name: names) {
            System.out.println(name);
        }

        names.set(2, "Rekha");

        System.out.println("Printing all elements");
        for(String name: names) {
            System.out.println(name);
        }

        names.remove(1);
        System.out.println("Printing all elements after deletion");
        for(String name: names) {
            System.out.println(name);
        }


    }
}
