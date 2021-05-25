package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesisProblem {
    static boolean isMatching(char A, char B) {
        return (A == '(' && B == ')' || A == '[' && B == ']' || A == '{' && B == '}');
    }

    static boolean isBalanced(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if(x == '(' || x == '[' || x == '{') {
                stack.push(x);
            } else {
                if(stack.isEmpty() == true) {
                    return false;
                }else if(isMatching(stack.peek(),x) == false) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty() == true;
    }

    public static void main(String[] args) {
        String s="{[()]}";

        System.out.println(isBalanced(s));
    }
}
