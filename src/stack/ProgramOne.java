package stack;

import java.util.ArrayDeque;

public class ProgramOne {
    public static void main(String[] args) {
        ArrayDeque<Integer> ard = new ArrayDeque<>();
        ard.push(10);
        ard.push(20);
        ard.push(30);

        System.out.println(ard.peek());
        System.out.println(ard.pop());
        System.out.println(ard.peek());
    }
}
