package maps;

import java.util.TreeMap;

public class TreeMapProgramThree {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();

        tm.put(15, "Fifteen");
        tm.put(10, "Ten");
        tm.put(5, "Five");

        System.out.println(tm.higherKey(10));
        System.out.println(tm.lowerKey(10));
        System.out.println(tm.ceilingKey(10));
        System.out.println(tm.floorKey(10));
     }
}
