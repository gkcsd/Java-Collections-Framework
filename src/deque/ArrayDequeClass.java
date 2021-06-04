package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        Deque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);

        System.out.println(ad);
    }
}
