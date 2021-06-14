package maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProgram {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(15, "Fifteen");
        tm.put(10, "Ten");
        tm.put(5, "Five");

        System.out.println(tm);

        System.out.println(tm.containsKey(10));

        for(Map.Entry<Integer,String> e: tm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
     }
}
