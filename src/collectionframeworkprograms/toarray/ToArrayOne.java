package collectionframeworkprograms.toarray;

import java.util.ArrayList;
import java.util.List;

public class ToArrayOne {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);

        Object arr[] = list.toArray();

        for(Object x: arr) {
            System.out.println(x);
        }
    }
}
