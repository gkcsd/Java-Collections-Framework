package treeset;

import java.util.TreeSet;

public class TreeSetTwo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(5);
        ts.add(2);
        ts.add(15);

        System.out.println(ts.lower(5));
        System.out.println(ts.higher(5));
        System.out.println(ts.ceiling(5));
        System.out.println(ts.floor(5));
    }
}
