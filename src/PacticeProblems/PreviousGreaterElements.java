package PacticeProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterElements {
        static void prevGreatElem(int arr[]) {
            Deque<Integer> stack = new ArrayDeque<>();
            stack.push(arr[0]);;
            int pg = -1;
            System.out.print(pg + " ");

            for(int i = 0; i < arr.length; i++) {
                while(stack.isEmpty() == false && stack.peek() <= arr[i]) {
                    stack.pop();
                }
                pg = stack.isEmpty() ? -1 : stack.peek();
                System.out.print(pg + " ");
                stack.push(arr[i]);
            }
        }

    public static void main(String[] args) {
        int arr[] = {20,30,10,5,15};

        prevGreatElem(arr);
    }
}
