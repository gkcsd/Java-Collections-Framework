package priorityqueue;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PurchasingMaxItems {

    static int maxItem(List<Integer> al, int sum) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(al);
        int res = 0;
        while(sum >= 0 && pq.isEmpty() == false && pq.peek() <= sum) {
            sum = sum - pq.poll();
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Integer arr[] = {1,12,5,111,200};

        List<Integer> al = Arrays.asList(arr);

        System.out.println(maxItem(al,10));
    }
}
