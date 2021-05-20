package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTwo {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);

        ListIterator<Integer> it = li.listIterator(li.size());

        //Its printing in reverse order
        while(it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
