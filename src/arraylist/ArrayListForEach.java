package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEach {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);

        li.forEach(x -> System.out.println(x));
    }
}
