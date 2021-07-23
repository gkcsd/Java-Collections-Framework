package array;

import java.util.Arrays;

public class ArrayCompareMethod {
    public static void main(String[] args) {
        int a[] = {10,20,15};
        int b[] = {10,20,30};

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
