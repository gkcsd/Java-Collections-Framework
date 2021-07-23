package array;

import java.util.Arrays;

public class ArrayEqualMethod {
    public static void main(String[] args) {
        int a[] = {10,15,20};
        int b[] = {10,15,20};
        int c[] = {15,10,20};

        if(Arrays.equals(a,b)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        if(Arrays.equals(a,c)) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
