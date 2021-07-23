package array;

import java.util.Arrays;

public class ArrayFillMethod {
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        Arrays.fill(arr, -1);

        System.out.println(Arrays.toString(arr));
    }
}
