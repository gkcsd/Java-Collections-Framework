package array;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
       int arr[] = {10,20,25,40,40};

       System.out.println(Arrays.binarySearch(arr, 20));
       System.out.println(Arrays.binarySearch(arr, 0, 3, 25));
       System.out.println(Arrays.binarySearch(arr, 22));
    }
}

