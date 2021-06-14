package maps;

import java.util.LinkedHashMap;

public class LinkedHashMapProgramTWo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
        lh.put("First", 10);
        lh.put("Second", 15);
        lh.put("Third", 20);
        lh.put("Second", 25);

        System.out.println(lh);
    }
}
