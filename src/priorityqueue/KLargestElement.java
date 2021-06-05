package priorityqueue;

import java.util.PriorityQueue;

public class KLargestElement {

    static void printKLargest(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for(int i = k; i < arr.length; i++) {
            if(arr[i] > pq.peek()) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        for(int i = 0; i < k; i++) {
            System.out.println(pq.poll());
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,23,12,9,30,2,50};
        printKLargest(arr,3);
    }
}
