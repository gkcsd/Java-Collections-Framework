package hashmap;

import java.util.HashMap;

public class MoreFunctionOfHashMapTwo {
    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();
        m.put("Ganesh", 10);
        m.put("Kale", 20);
        m.put("Morning", 30);

        if(m.containsValue(20))
            System.out.println("Yes");
        else
            System.out.println("No");

        System.out.println(m.get("Ganesh"));
        System.out.println(m.get("Practice"));
    }
}
