package hashmap;

import java.util.HashMap;

public class MoreFunctionOfHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();
        m.put("Ganesh", 10);
        m.put("Kale", 20);
        m.put("Here", 30);

        if(m.containsKey("Ganesh"))
            System.out.println("Yes");
        else
            System.out.println("No");

        m.remove("Ganesh");
        System.out.println(m.size());
    }
}
