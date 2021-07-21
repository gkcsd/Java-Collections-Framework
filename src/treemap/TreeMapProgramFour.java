package treemap;

import java.util.TreeMap;

public class TreeMapProgramFour {
    public static void main(String[] args) {
        TreeMap<Integer,String> t = new TreeMap<>();
        t.put(10, "Ganesh");
        t.put(5, "Kale");
        t.put(15, "Morning");

        System.out.println(t.higherEntry(10).getValue());
        System.out.println(t.lowerEntry(10).getValue());
        System.out.println(t.floorEntry(10).getValue());
        System.out.println(t.ceilingEntry(10).getValue());
    }
}
