package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class ReverseKItemsQueue {
    static void reverseK(Queue<Integer> q, int k) {
        if(q.size() < 0 || k <= 0) {
            return;
        }

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        while(stack.isEmpty() == false)
            q.offer(stack.pop());

        for(int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new ArrayDeque<>();
        int k = sc.nextInt();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        reverseK(q,k);
        System.out.println(q);


    }
}
