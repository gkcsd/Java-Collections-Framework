package LinkedList;

import java.util.LinkedList;

public class ProgramOne {
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);

        System.out.println(li);

        for(Integer x : li) {
            System.out.println(x);
        }
    }
}
