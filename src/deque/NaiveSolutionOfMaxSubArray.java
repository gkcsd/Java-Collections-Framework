package deque;

import java.util.Scanner;

public class NaiveSolutionOfMaxSubArray {
    static void maxSubArray(int arr[], int k) {
        for(int i = 0; i <= arr.length - k; i++) {
            int mx = arr[i];
            for(int j = i + 1; j < i + k; j++) {
                mx = Math.max(mx, arr[j]);
            }
            System.out.print(mx + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxSubArray(arr,k);
    }
}
