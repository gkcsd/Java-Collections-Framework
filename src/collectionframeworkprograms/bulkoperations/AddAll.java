package collectionframeworkprograms.bulkoperations;

import java.util.*;

public class AddAll {
    public static void main(String[] args) {
        Set<Integer> lst1 = new TreeSet<>();
        lst1.add(10);
        lst1.add(20);
        lst1.add(30);

        Set<Integer> lst2 = new TreeSet<>();
        lst2.add(40);
        lst2.add(30);

        lst1.addAll(lst2);

        System.out.println(lst1);
    }
}
