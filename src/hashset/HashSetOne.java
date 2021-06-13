package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetOne {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("Hii");
        s.add("Ganesh");
        s.add("Kale");

        System.out.println(s);
        System.out.println(s.contains("Ganesh"));

        Iterator<String> it = s.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
