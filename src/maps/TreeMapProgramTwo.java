package maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProgramTwo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(15, "Fifteen");
        tm.put(10, "Ten");
        tm.put(5, "Five");

        tm.remove(15);

        System.out.println(tm);

        System.out.println(tm.size());
     }
}
