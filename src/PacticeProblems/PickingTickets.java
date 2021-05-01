package PacticeProblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PickingTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(maxSubsequence(arr,n));
    }
    static int maxSubsequence(int arr[], int n) {
        int max = 0, count = 0, i;
        boolean flag = true;

        for (i = 0; i < n - 1; i++) {
            int diff = arr[i+1] - arr[i];

            if (diff == 0 || diff == 1) {
                count++;
                flag = true;
            }else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if (flag) {
            return count>max?count+1:max+1;
        } else
            return max;
    }
}
