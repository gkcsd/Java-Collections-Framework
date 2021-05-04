package collectionframeworkprograms.bulkoperations;

import java.util.ArrayList;
import java.util.List;

public class RetainAll {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(10);
        lst1.add(20);
        lst1.add(30);

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(10);
        lst2.add(20);

        lst1.retainAll(lst2);
        System.out.println(lst1);
    }
}
