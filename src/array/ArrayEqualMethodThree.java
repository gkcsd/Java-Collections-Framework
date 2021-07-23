package array;

import java.util.Arrays;

public class ArrayEqualMethodThree {
    public static void main(String[] args) {
        Integer a[] = {10,20,30,40,50};
        Integer b[] = {30,40,50,5,8};

        if(Arrays.equals(a,2,5,b,0,3)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
