package maps;

import java.util.HashMap;

public class HashMapProgramThree {
    public static void main(String[] args) {
        HashMap<String, Integer> m = new HashMap<>();
        m.put("First", 10);
        m.put("Second", 15);
        m.put("Third", 20);

        if(m.containsValue(15))
            System.out.println("YES");
        else
            System.out.println("NO");

        System.out.println(m.get("Second"));
        System.out.println(m.get("Practice"));
    }
}
