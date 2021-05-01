package PacticeProblems;

import java.util.*;
public class PickingTicketsTwo {
    public static int longestAr(int n, int arr[]){
        Hashtable<Integer, Integer> count = new Hashtable<Integer, Integer>();

        // Storing the frequency of each
        // element in the hashtable count
        for (int i = 0; i < n; i++) {
            if (count.containsKey(arr[i]))
                count.put(arr[i], count.get(arr[i]) + 1);
            else
                count.put(arr[i], 1);
        }

        Set<Integer> kset = count.keySet();
        Iterator<Integer> it = kset.iterator();

        int max = 0;

        while (it.hasNext()) {
            int a = (int)it.next();
            int cur = 0;
            int cur1 = 0;
            int cur2 = 0;

            if (count.containsKey(a + 1))
                cur1 = count.get(a + 1);

            if (count.containsKey(a - 1))
                cur2 = count.get(a - 1);

            cur = count.get(a) +
                    Math.max(cur1, cur2);

            if (cur > max)
                max = cur;
        }

        return (max);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxLen = longestAr(n, arr);
        System.out.println(maxLen);
    }
}