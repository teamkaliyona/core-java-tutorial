package collections.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Players> playersList = new ArrayList<>();
        playersList.add(new Players(30, "Virat", "RCB"));
        playersList.add(new Players(25, "Chahal", "RCB"));
        playersList.add(new Players(35, "Dhoni", "CSK"));

        Collections.sort(playersList, new AgeComparator());

        System.out.println(playersList.toString());

        Collections.sort(playersList, new NameComparator());

        System.out.println(playersList.toString());
    }

}
