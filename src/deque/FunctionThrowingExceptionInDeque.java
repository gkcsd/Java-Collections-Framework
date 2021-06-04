package deque;

import java.util.Deque;
import java.util.LinkedList;

public class FunctionThrowingExceptionInDeque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);

        System.out.println(d.getFirst());
        System.out.println(d.getLast());

        d.removeFirst();
        d.removeLast();

        System.out.println(d.getFirst());
        System.out.println(d.getLast());
    }
}
