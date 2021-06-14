package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("First", 10);
        m.put("Second", 15);
        m.put("Third", 20);

        System.out.println(m);
        System.out.println(m.size());

        for(Map.Entry<String, Integer> e: m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
