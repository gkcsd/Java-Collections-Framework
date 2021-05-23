package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodIsEmptyAndClear {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);

        System.out.println(li.isEmpty());

        li.clear();
        System.out.println(li);
    }
}
