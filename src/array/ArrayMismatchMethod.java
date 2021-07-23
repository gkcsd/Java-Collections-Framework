package array;

import java.util.Arrays;

public class ArrayMismatchMethod {
    public static void main(String[] args) {
        int a[] = {10,20,30};
        int b[] = {10,20,30};
        int c[] = {10,20,40,30};

        System.out.println(Arrays.mismatch(a,b));
        System.out.println(Arrays.mismatch(a,c));
        System.out.println(Arrays.mismatch(a,0,2,b,0,2));
    }
}
