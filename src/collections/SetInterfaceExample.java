package collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetInterfaceExample {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();

        System.out.println("Is HashSet Empty " + names.isEmpty());

        names.add("Rahul");
        names.add("Ankita");
        names.add("Deepak");
        names.add("Raj");

        System.out.println("Is HashSet Empty " + names.isEmpty());

        for(String name :  names){
            System.out.println(name);
        }

        names.add("Ankita");
        System.out.println("Printing after adding duplicates");
        for(String name :  names){
            System.out.println(name);
        }

        System.out.println("Checking if Raj is exists: " + names.contains("Raj"));
        System.out.println("Checking if Rani is exists: " + names.contains("Rani"));

        TreeSet<String> namesTreeSet = new TreeSet<String>();
        namesTreeSet.add("Rahul");
        namesTreeSet.add("Ankita");
        namesTreeSet.add("Raj");
        namesTreeSet.add("Deepak");

        System.out.println("Printing elements in Treeset");
        for(String name : namesTreeSet){
            System.out.println(name);
        }

    }

}
