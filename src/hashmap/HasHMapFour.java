package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HasHMapFour {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("Ganesh", 10);
        m.put("Kale", 20);
        m.put("Morning", 30);
        System.out.println(m);

        System.out.println(m.size());

        for(Map.Entry<String,Integer> e: m.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
