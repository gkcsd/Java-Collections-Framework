package array;

import java.util.Arrays;

public class ArrayCompareMethodThree {
    public static void main(String[] args) {
        Integer a[] = {10,20,30,40,50};
        Integer b[] = {10,20,30,35,80};

        int res = Arrays.compare(a,0,3,b,0,3);

        if(res == 0) {
            System.out.println("Same");
        }else if(res > 0) {
            System.out.println("a is greater");
        }else if(res < 0) {
            System.out.println("a is smaller");
        }
    }
}
