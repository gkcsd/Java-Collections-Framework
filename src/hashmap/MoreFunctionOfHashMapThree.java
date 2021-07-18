package hashmap;

import java.util.LinkedHashMap;

public class MoreFunctionOfHashMapThree {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> m = new LinkedHashMap<>(4, 0.6f, true);
        m.put(10, "Ganesh");
        m.put(5, "Here");
        m.put(80, "Kale");
        m.put(20, "B.Tech");

        System.out.println(m.get(10));
        System.out.println(m);

        m.put(5, "Practice");
        System.out.println(m);
    }
}