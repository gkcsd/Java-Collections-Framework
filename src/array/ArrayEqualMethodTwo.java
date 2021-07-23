package array;

import java.util.Arrays;

public class ArrayEqualMethodTwo {
    public static void main(String[] args) {
        Integer a[] = {10,15, null, 20};
        Integer b[] = {10,15, 20, null};

        if(Arrays.equals(a,b)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
