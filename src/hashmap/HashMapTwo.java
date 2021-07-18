package hashmap;

import java.util.HashMap;
import java.util.Map;

//In HashMap inserted data in not proper order
public class HashMapTwo {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(10, "Ganesh");
        m.put(20, "Kale");
        m.put(30, "here");
        System.out.println(m);
    }
}
