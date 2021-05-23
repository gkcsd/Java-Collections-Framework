package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodContainRemove {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("I");
        li.add("am");
        li.add("Not");
        li.add("Good");
        li.add("Ok");
        System.out.println(li.contains("Good"));

        li.remove(2);
        System.out.println(li.contains("Not"));

        li.remove("Ok");
        System.out.println(li.contains("Ok"));

        System.out.println(li);
    }
}
