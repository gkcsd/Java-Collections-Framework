package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class JosephusProblem {

    static int josephusProblem(int n, int k) {
        LinkedList<Integer> li = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            li.add(i);
        }

        Iterator<Integer> it = li.iterator();

        while(li.size() > 1) {
            int count = 0;
            while (count < k) {
                while (it.hasNext() && count < k) {
                    it.next();
                    count++;
                }
                if (count < k) {
                    it = li.iterator();
                    it.next();
                    count++;
                }
            }
            it.remove();
        }
        return li.getFirst();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = josephusProblem(n,k);

        System.out.println(result);
    }
}
