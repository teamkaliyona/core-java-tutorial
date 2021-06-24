package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Amar");
        names.add("Akbar");
        names.add("Antony");

        ListIterator<String> listIterator = names.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Iterating in backward direction");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

}
