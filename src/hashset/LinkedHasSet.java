package hashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSet {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);

        for(Integer x : s) {
            System.out.println(x);
        }
    }
}
