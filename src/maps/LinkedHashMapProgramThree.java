package maps;

import java.util.LinkedHashMap;

public class LinkedHashMapProgramThree {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lh = new LinkedHashMap<>(4,0.6f,true);
        lh.put(10, "Ten");
        lh.put(20, "Twenty");
        lh.put(15,"Fifteen");

        System.out.println(lh.get(10));

        System.out.println(lh);

        lh.put(20, "TWENTY");

        System.out.println(lh);


    }
}
