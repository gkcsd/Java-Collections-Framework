package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListModified {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);

        for(int i = 0; i < li.size(); i++) {
            int x = li.get(i);

            li.set(i, x*10);
        }
        System.out.println(li);
    }
}
