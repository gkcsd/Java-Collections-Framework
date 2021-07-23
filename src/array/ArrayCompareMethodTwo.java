package array;

import java.util.Arrays;

public class ArrayCompareMethodTwo {
    public static void main(String[] args) {
        Integer a[] = {10,20, null,30};
        Integer b[] = {10,20,-30,40};

        int res = Arrays.compare(a,b);

        if(res == 0) {
            System.out.println("Same");
        }else if(res > 0) {
            System.out.println("a is greater");
        }else if(res < 0) {
            System.out.println("a is smaller");
        }
    }
}
