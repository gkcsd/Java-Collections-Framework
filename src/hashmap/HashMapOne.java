package hashmap;

import java.util.Map;
import java.util.TreeMap;

//In TreeMap data inserted and it stored in ascending order
public class HashMapOne {
    public static void main(String[] args) {
        Map<Integer,String> m = new TreeMap<>();
        m.put(10, "Good Morning");
        m.put(20,"Ganesh");
        m.put(30,"Kale");
        System.out.println(m);

        System.out.println();
    }
}
