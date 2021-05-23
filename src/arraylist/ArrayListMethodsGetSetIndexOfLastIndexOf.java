package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodsGetSetIndexOfLastIndexOf {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(10);
        li.add(20);
        li.add(10);
        li.add(30);

        System.out.println(li.get(1));
        li.set(1,40);
        System.out.println(li.get(1));
        System.out.println(li.indexOf(10));
        System.out.println(li.lastIndexOf(10));
        System.out.println(li.indexOf(50));
    }
}
