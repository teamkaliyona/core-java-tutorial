package collections;

import java.util.*;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amar");
        names.add("Akbar");
        names.add("Antony");

        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Alia");
        students.put(2, "Ben");
        students.put(3, "Chetan");

        Iterator mapItr = students.entrySet().iterator();
        while (mapItr.hasNext()){
            System.out.println(mapItr.next());
        }
    }

}
