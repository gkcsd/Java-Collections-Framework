package maps;

import java.util.LinkedHashMap;

public class LinkedHashMapProgram {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
        lh.put("First", 10);
        lh.put("Second", 15);
        lh.put("Third", 20);
        lh.put("Fourth", 25);
        lh.put("Fifth", 30);

        System.out.println(lh);
    }
}
