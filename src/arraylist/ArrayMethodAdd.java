package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayMethodAdd {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("I");
        li.add("Love");
        li.add("Java");

        System.out.println(li);

        li.add(1, "We");

        System.out.println(li);
    }
}
