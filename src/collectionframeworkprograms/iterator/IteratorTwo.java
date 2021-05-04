package collectionframeworkprograms.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTwo {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(15);
        c.add(20);
        removeEven(c);
        System.out.println(c);
    }
    static void removeEven(Collection<?> c) {
        Iterator<?> it = c.iterator();

        while(it.hasNext()) {
//          if(cond(it.next()) == true) {
//              it.remove();
//          }
        }
    }
}
