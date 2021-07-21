package treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProgram {
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<>();
        t.put(10, "Ganesh");
        t.put(20, "Kale");
        t.put(30, "Morning");
        System.out.println(t);

        System.out.println(t.containsKey(20));

        for(Map.Entry<Integer,String> e: t.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
