package hashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapOne {
    public static void main(String[] args) {
        java.util.LinkedHashMap<Integer, String> m = new java.util.LinkedHashMap<>();
        m.put(10,"Ganesh");
        m.put(5,"Kale");
        m.put(80,"B.Tech");
        m.put(30,"CSE");
        m.remove(5);
        m.put(5,"NANA");
        System.out.println(m);
    }
}
