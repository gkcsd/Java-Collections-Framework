package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

//In LinkedHashMap data inserted in insertion order
public class HashMapThree {
    public static void main(String[] args) {
        Map<Integer,String> m = new LinkedHashMap<>();
        m.put(10, "Ganesh");
        m.put(20, "here");
        m.put(5, "kale");
        System.out.println(m);
    }
}
