package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOne {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Ganesh");
        ts.add("Kale");
        ts.add("Dear");

        System.out.println(ts);
        System.out.println(ts.contains("Dear"));

        Iterator<String> it = ts.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
