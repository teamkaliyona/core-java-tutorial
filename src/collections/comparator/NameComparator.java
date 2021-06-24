package collections.comparator;


import java.util.Comparator;

public class NameComparator implements Comparator<Players> {

    @Override
    public int compare(Players p1, Players p2){
        return p1.getName().compareTo(p2.getName());
    }
}
