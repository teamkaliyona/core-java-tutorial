package collections.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Players> {

    @Override
    public int compare(Players p1, Players p2){
        return p1.age - p2.age;
    }

}
