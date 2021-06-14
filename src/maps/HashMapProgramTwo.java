package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgramTwo {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("First", 10);
        m.put("Second", 15);
        m.put("Third", 20);

        if(m.containsKey("Second"))
            System.out.println("YES");
        else
            System.out.println("NO");

        m.remove("Second");

        System.out.println(m.size());
    }
}
