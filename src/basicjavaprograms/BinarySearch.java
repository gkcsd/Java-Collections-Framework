package basicjavaprograms;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 23, 56, 78, 81, 89, 100};
        int n = arr.length;
        int x = 81;
        int res = binarySearch(arr, 0, n - 1, x);
        if (res == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at the index number " + res);
        }
    }
    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r-l)/ 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
