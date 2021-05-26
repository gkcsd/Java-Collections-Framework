package stack;

import java.util.ArrayDeque;
import java.util.Deque;


//Time complexity for this solution is 0(n) and
// the Auxiliary space is O(n)
public class StockSpanProblem {
    static void printStack(int arr[]) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(0);
        int span = 1;
        System.out.print(span + " ");
        for(int i = 1; i< arr.length; i++) {
            while(stack.isEmpty() == false && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            span = stack.isEmpty() ? i+1 : i-stack.peek();
            System.out.print(span + " ");
            stack.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {60,10,20,40,35,30,50,70,65};

        printStack(arr);
    }
}
