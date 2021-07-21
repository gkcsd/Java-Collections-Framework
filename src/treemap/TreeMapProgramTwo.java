package treemap;

import java.util.TreeMap;

public class TreeMapProgramTwo {
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<>();
        t.put(20, "Kale");
        t.put(10, "Ganesh");
        t.put(30, "Here");
        System.out.println(t);

        System.out.println();

        t.remove(30);
        System.out.println(t);
        System.out.println(t.size());
    }
}
