package collectionframeworkprograms.bulkoperations;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
    public static void main(String[] args) {
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(10);
        lst1.add(12);
        lst1.add(15);
        lst1.add(18);
        lst1.add(21);

        lst1.removeIf((n) -> (n%2 == 0));

        System.out.println(lst1);
    }
}
