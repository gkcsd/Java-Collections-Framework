package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateNumbersGivenDigits {
    static void printFirstN(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("5");
        q.add("6");

        for(int i = 0; i < n; i++) {
            String curr = q.poll();
            System.out.print(curr + " ");
            q.add(curr + "5");
            q.add(curr + "6");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
       printFirstN(k);
    }
}
