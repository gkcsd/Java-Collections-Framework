package treemap;

import java.util.TreeMap;

public class TreeMapProgramThree {
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<>();
        t.put(10, "Ganesh");
        t.put(5, "Kale");
        t.put(15, "Morning");

        System.out.println(t.higherKey(10));
        System.out.println(t.lowerKey(10));
        System.out.println(t.floorKey(10));
        System.out.println(t.ceilingKey(10));
    }
}
