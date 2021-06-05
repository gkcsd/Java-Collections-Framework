package priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class ProgramTwo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //using this we created PriorityQueue as a max heap

        pq.add(10);
        pq.add(20);
        pq.add(15);

        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}
