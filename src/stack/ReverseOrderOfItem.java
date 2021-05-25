package stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseOrderOfItem {
    static void myReverse(List<Integer> list) {
        Stack<Integer> s = new Stack<>();

        for(Integer x : list) {
            s.push(x);
        }
        for(int i=0;i<list.size();i++) {
            list.set(i,s.pop());
        }
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40);

        System.out.println("Before: " + list);

        myReverse(list);

        System.out.println("After: " + list);
    }
}
