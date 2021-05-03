package collectionframeworkprograms.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorOne {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(15);
        c.add(20);
        removeEven(c);
        System.out.println(c);
    }
    static void removeEven(Collection<Integer> c) {
        Iterator<Integer> it = c.iterator();

        while(it.hasNext()) {
            int x = (Integer)it.next();

            if(x%2 == 0) {
                it.remove();
            }
        }
    }
}
